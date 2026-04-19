package brianhazel.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    void main() {
        // try-with-resources: FileImputStream will be closed automatically
        try (FileInputStream input = new FileInputStream("HazelFile.txt")) {
            int i; // variable to store each byte that is read
            //Read one byte at a time until end of file (-1 means "no more data")
            while ((i = input.read()) != -1) {
                // Convert thebyte to a character and print it to the console
                System.out.println(i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file. " + e.getMessage());
        }
    }
}
