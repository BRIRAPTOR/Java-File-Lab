package brianhazel;

import java.io.File;

public class DeleteFile {
    void main() {
        File myObj = new File("Fileprueba.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
