/*
*   This class contains the necessary functions to store and retrieve data from local files
 */
package softwaremanager;
import java.io.*;
import java.util.ArrayList;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DatabaseManager {
    
    public static ArrayList<String> profiles = new ArrayList<String>();
    static JSONObject obj = new JSONObject();
    static JSONObject database = new JSONObject();
    static JSONParser parser = new JSONParser();
    public static void main() throws FileNotFoundException, IOException, ParseException
    {        
        try{
            database = (JSONObject) (parser.parse(new FileReader("db.json")));
            System.out.println(database.toJSONString());
            profiles = (ArrayList<String>) database.get("profiles");
            SoftwareManager.currentProfile.name = (String) database.get("current");
            if(! SoftwareManager.currentProfile.name.equals(""))
                readFromFile();
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
    public static void SaveProfile(Profile profile) throws IOException{
        FileWriter file = null; // Settings file
        FileOutputStream batFile =null;
        String st = "start \"\" \"";
        FileWriter batch = null;
        try{
            //Create folder
            new File(profile.name).mkdir();
            batch = new FileWriter(profile.name+"/"+profile.name+".bat");
            file = new FileWriter(profile.name+"/settings.json");
            
            obj = new JSONObject();
            obj.put("name", profile.name);
            obj.put("description", profile.desc);
            JSONArray list = new JSONArray();
            
            int size = profile.programs.size();
            for(int i=0;i<size;i++)
            {
                batch.write(st);
                batch.write(profile.programs.get(i).path +'"'+'\n');
                list.add(profile.programs.get(i).name);
                obj.put(profile.programs.get(i).name, profile.programs.get(i).path);
            }
            if(! profiles.contains(profile.name))
            {
                profiles.add(profile.name);
            }
            obj.put("programs", list);
            // Converting the JSON object to a string and storing it in a file
            file.write(obj.toJSONString());
            file.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            batch.close();
            saveDB();
        }
    }
    public static void readFromFile() throws FileNotFoundException, ParseException
    {    
        //Use JSON for settings file as well
        try{
            FileReader file = new FileReader(SoftwareManager.currentProfile.name+"/settings.json");
            obj = (JSONObject) (parser.parse(file));
            System.out.println(obj.toJSONString());
             JSONArray msg = (JSONArray) obj.get("programs");
             for (int i=0;i<msg.size();i++)
             {
                 SoftwareManager.currentProfile.programs.add(new Program(msg.get(i).toString(),obj.get(msg.get(i)).toString()));
             }
             file.close();
            SoftwareManager.currentProfile.desc = (String) obj.get("description");
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
    public static void deleteProfile(String prof){
        File f = new File(prof);
        deleteFile(f);
        SoftwareManager.currentProfile = new Profile();
        profiles.remove(prof);
        saveDB();
    }
    public static void deleteFile(File file){
        // Since JAVA cannot delete an entire directory at once,
        // this function is used to recursively the files in a directory/folder
        // and delete them individually
        System.out.println(file.getAbsolutePath());
        if(file.isDirectory()){
            File[] children = file.listFiles();
            for(int i=0;i<children.length;i++){
                deleteFile(children[i]);
            }
        }
        file.delete();
    }
    public static void saveDB()
    {
        database.remove("profiles");
        database.put("profiles", profiles);
        // Remembering the previously selected profile
        database.put("current", SoftwareManager.currentProfile.name);
        
        FileWriter fileToSave;
        try{
            fileToSave = new FileWriter("db.json");
            fileToSave.write(database.toJSONString());
            fileToSave.close();
        }
       catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
    
}
