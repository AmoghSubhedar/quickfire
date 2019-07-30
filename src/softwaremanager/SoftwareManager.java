/*
*   This is the main class of the package softwaremanager
*   This class will be used to direct data and pass control to various other classes
 */
package softwaremanager;
import java.io.*;
import org.json.simple.parser.ParseException;
public class SoftwareManager {
    public static Profile currentProfile;
    public static void main(String[] args)throws FileNotFoundException, IOException, ParseException {
        DatabaseManager db = new DatabaseManager();
        currentProfile = new Profile();
        DatabaseManager.main();
        MainMenu mn =new MainMenu();
        MainMenu.main();
    }
    public static void launchProfile() throws IOException
    {
        String path = currentProfile.name+'\\'+currentProfile.name+".bat";
        Runtime.getRuntime().exec("cmd /b start cmd /c"+path);
//        Change /c to /k for debugging
//        Use /min to auto-minimize the cmd window
//        Use /b to prevent command prompt window from showing
    }
}
