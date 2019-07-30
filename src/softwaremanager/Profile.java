package softwaremanager;

import java.util.ArrayList;
/*
This small java class is used to serve as a composite data structure where all the data in
a user-definable 'profile' can be treated as an object whose instance variables store
its various properties.
*/
public class Profile {
    public String name;
    public String desc;
    public ArrayList<Program> programs;
    
    Profile(String n,String d, ArrayList<Program> pr){
        name = n;
        d=desc;
        programs=pr;
        
    }
    Profile()
    {
        name="";
        desc="";
        programs = new ArrayList<Program>();
    }
}
