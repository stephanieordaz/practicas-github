package archivos;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileInBlocks {

    public static void main(String[] args) {
        byte buffer[] = new byte[1000];
        try {
            FileInputStream fd_in = new FileInputStream("archivo.dat");
            while (fd_in.read(buffer) != -1) {
                // Procesar el bloque de datos leído
                // ...
            }
            fd_in.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
}
