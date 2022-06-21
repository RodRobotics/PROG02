package PROG02;
// Java program to demonstrate Properties class to get
// information from the properties file

import java.util.*;
import java.io.*;
class JavaProp  {
    public static void main(String[] args) throws Exception
    {
        // create a reader object on the properties file
        FileReader reader = new FileReader("C:\\Users\\Eduardo\\IdeaProjects\\PROG0202\\app\\src\\main\\resources\\data\\db.properties");

        // create properties object
        Properties p = new Properties();

        // Add a wrapper around reader object
        p.load(reader);

        // access properties data
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        System.out.println(p.getProperty("gender"));
        p.clear();

    }
}
