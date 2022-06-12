package PROG02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class RandomeAccesFile {

    public static void main(String[] args) throws IOException {
    RandomAccessFile file;
    String sourcePathName = "C:\\Users\\Eduardo\\Documents\\src\\java\\Demo.txt";
    String access = "rw";
    long position;
    List<Byte> dest01 = new ArrayList<Byte>();
    //byte[] dest      = new byte[file];
    int    offset    = 0;
    //int    length    = 1024;
    int index = 0;
    int lenth = 0;


        {
            try {
                file = new RandomAccessFile(sourcePathName, access);
                file.write(57);
                byte[] bytes = "Hello World of".getBytes("UTF-8");
                file.write(bytes, 2, 5);
                file.close();
                /**position = file.getFilePointer();
                 do {
                   lenth ++;
                } while(file.read()!= -1);

                byte[] dest      = new byte[lenth];
                int    bytesRead = file.read(dest, offset, lenth);

                System.out.println("Lenge"+bytesRead);
                do {
                    System.out.println(dest[index]);
                    index++;
                }while ( index <= dest.length);
                 **/
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}