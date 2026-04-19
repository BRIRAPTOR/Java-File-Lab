package brianhazel;

import java.io.File;

public class FileInfo {
    void main() {
        File myObj = new File("BrianFile.txt");
        if (myObj.exists()) {
            System.out.println("The file exists.");
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
