package PROG02;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileStreamOpenClose {
    public static void main(String[] args) {
        String fname = "C:\\Users\\Eduardo\\Documents";
        String sourcePathName = "C:\\Users\\Eduardo\\Documents\\src\\java\\Demo.txt";
        String targetPathName = "C:\\Users\\Eduardo\\Documents\\src\\java\\DemoC.txt";
        try (FileInputStream fin = new FileInputStream(sourcePathName);
             FileOutputStream fout = new FileOutputStream(targetPathName)) {
            int byteValue;
do{
    byteValue  = fin.read();
    if(byteValue != -1){
        fout.write(byteValue);
        System.out.println(byteValue);
    }
}while (byteValue != -1);

        }catch(FileNotFoundException e) { System.out.println("File not found: " + e.getMessage()); }
        catch(IOException e) { System.out.println("IO Error: " + e.getMessage()); }


        try (FileReader reader = new FileReader(sourcePathName, Charset.forName("UTF-8"))) {
            // read character-by-charachter
            int charValue; // variable to hold a value
            do {
                charValue = reader.read(); // read next byte from file
                if(charValue !=-1) // if not end of file
                    //System.out.print((char)charValue);// write char value to console
                System.out.print((char)charValue);
            } while(charValue != -1); // reached end of file ?
        } // fin & fout will be automatically closed here ( -> try-with-resource)
        catch(FileNotFoundException e) { System.out.println("File not found: " + e.getMessage()); }
        catch(IOException e) { System.out.println("IO Error: " + e.getMessage()); }
    }


























    }

