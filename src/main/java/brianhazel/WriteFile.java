package brianhazel;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    void main() {
        try (FileWriter myWriter = new FileWriter("BrianFile.txt", true)) {
            myWriter.write("en estos momentos estoy escuchando musica de banda y estoy en el cuarto que estaba rentando atrás del puesto.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}