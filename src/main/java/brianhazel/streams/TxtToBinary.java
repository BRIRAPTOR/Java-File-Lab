package brianhazel.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TxtToBinary {
    void main() {
        try (FileInputStream input = new FileInputStream("rina.txt");
             FileOutputStream output = new FileOutputStream("rina_recontruida.jpg")) {
            int c; // Para leer cada carácter del TXT
            int currentByte = 0; // Aquí iremos armando el byte
            int bitCount = 0;
            long totalBitsProcesados = 0; // 1. EL CONTADOR
            long LIMITE_BITS = 254508;
            while ((c = input.read()) != -1) {
                // Si ya llegamos al límite, rompemos el bucle 'while' inmediatamente
                if (totalBitsProcesados >= LIMITE_BITS) {
                    System.out.println("Se alcanzó el límite de bits. Deteniendo la reconstrucción.");
                    break;
                }

                if (c == '0' || c == '1') {
                    int bit = c - 48;
                    // Empujamos los bits a la izquierda y metemos el nuevo bit al final
                    currentByte = (currentByte << 1) | bit;
                    bitCount++;
                    totalBitsProcesados++; // Aumentamos el contador por cada bit válido
                    // Cuando ya tenemos 8 bits, escribimos el byte completo en la imagen
                    if (bitCount == 8) {
                        output.write(currentByte);
                        currentByte = 0;
                        bitCount = 0;
                    }
                }
            }
            System.out.println("¡Imagen reconstruida con éxito!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
