package PROG02;
// In this Java program, we accepts a file or directory name from
// command line arguments. Then the program will check if
// that file or directory physically exist or not and
// it displays the property of that file or directory.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Displaying file property
class fileProperty {

    public static void main(String[] args) throws IOException {

        // accept file name or directory name through
        // command line args
        String fname = "C:\\Users\\Eduardo\\Documents";
        Path path = Path.of(fname);
        // pass the filename or directory name to File
        // object
        File f = new File(fname);

        // apply File class methods on File object
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:"
                + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());

        //with nio

        for(int i=0; i< path.getNameCount(); i++){
            System.out.println("File name NIO :" + path.getName(i));

        }
        System.out.println("File name :" + Files.isHidden(path));


        if (f.exists()) {
            System.out.println("Is writable:"
                    + f.canWrite());
            System.out.println("Is readable" + f.canRead());
            System.out.println("Is a directory:"
                    + f.isDirectory());
            System.out.println("File Size in bytes "
                    + f.length());
            File srcDir = new File(f, "src");
            System.out.println("File src createt? "
                    + srcDir.mkdir());
            File txt = new File(srcDir, "" + "java/zhaw/app");
            System.out.println("File text.txt createt? "
                    + txt.mkdirs());
        }

    }
}
