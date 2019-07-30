package softwaremanager;

/*
This is a small and simple class that will serve as a composite data
structure for the Profile.java class.
The objective is to store the name and absolute path of a program or file in the
respective instance variables.
*/
public class Program {
    public String name;
    public String path;
    
    public Program(String n, String p){
        name=n;
        path=p;
    }
    public Program()
    {
        name="";
        path="";
    }
}
