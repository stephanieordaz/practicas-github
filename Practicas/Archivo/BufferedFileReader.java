package archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedFileReader {

    public static void main(String[] args) {
        try {
            BufferedReader fd_in = new BufferedReader(new InputStreamReader(new FileInputStream("archivo.dat")));
            String line;
            while ((line = fd_in.readLine()) != null) {
                // Procesar la línea leída
                // ...
            }
            fd_in.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
}
