package brianhazel;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    void main() {
        try {
            File myObj = new File("Fileprueba.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

