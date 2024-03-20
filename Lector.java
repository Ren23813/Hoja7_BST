import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

    public String[] keys;
    public String[] values;

    public void leerArchivoBase(String archivo){
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String line;
                int numLines = contarLineas(archivo);
                keys = new String[numLines];
                values = new String[numLines];

                int i = 0;
                while ((line = br.readLine()) != null) {
                    line = line.replace("(", "").replace(")", "");
                    String[] partes = line.split(",");
                        keys[i] = partes[0]; 
                        values[i] = partes[1];
                        i++;
                    }
                }

             catch (IOException e) {
                e.printStackTrace();
        }
    }

    public String[] leerPaTraducir(String archivo){
        String[] partes = null;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                partes = line.split(" ");
                }
            }
         catch (IOException e) {
            e.printStackTrace();
    }
    return partes;
    }



    private int contarLineas(String archivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            int count = 0;
            while (br.readLine() != null) {
                count++;
            }
            return count;
        }

    }
}
