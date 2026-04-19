package brianhazel.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryToTxt {
    void main() {
        //Copy image.jpg into copy.jpg
        try (FileInputStream input = new FileInputStream("rina.jpg");
             FileOutputStream output = new FileOutputStream("rina.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                int[] misBits = getBits(i); // Convertir el byte a bits
                for (int bit : misBits) {
                    // Sumamos 48 para convertir el valor 0 en el carácter '0' (ASCII 48)
                    output.write(bit + 48);
                }
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int[] getBits(int b) {
        int[] bits = new int[8];
        for (int i = 0; i < 8; i++) {
            // Desplazamos los bits a la derecha y usamos & 1 para extraer el último bit
            bits[7 - i] = (b >> i) & 1;
        }
        return bits;
    }
}
