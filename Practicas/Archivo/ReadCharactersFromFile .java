package archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharactersFromFile {

    public static void main(String[] args) {
        try {
            InputStreamReader fd_in = new InputStreamReader(new FileInputStream("archivo.dat"));
            int c;
            while ((c = fd_in.read()) != -1) {
                // Procesar el carácter leído
                // ...
            }
            fd_in.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
}
