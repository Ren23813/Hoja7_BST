import java.util.Map;
import java.util.Scanner;

public class Controlador {
    public static Banco banco = new Banco();
	Lector lector = new Lector();
    Scanner scan = new Scanner(System.in);

    public void setDefaults(){
        System.out.println("Configuraciones iniciales de palabras, según la hoja de trabajo: ");
		banco.agregarPalabra("house", "casa");
		banco.agregarPalabra("dog", "perro");
		banco.agregarPalabra("homework", "tarea");
		banco.agregarPalabra("woman", "mujer");
		banco.agregarPalabra("town", "pueblo");
		banco.agregarPalabra("yes", "si");
		System.out.println("Se agregaron las palabras: house, dog, homework, woman, town, yes");
    }

    public void leerCompendio(String archivo){
		lector.leerArchivoBase(archivo);
		for (int i = 0; i < lector.keys.length; i++) {
			banco.agregarPalabra(lector.keys[i], lector.values[i]);			
		}
    }

    public void todasLasPalabras(){
        banco.getAllWords();
    }

    public void translate(String archivo){
        String[] coleccion = lector.leerPaTraducir(archivo);
        for (String palabra : coleccion) {
        if (Banco.hashMap.containsKey(palabra)) {
            String traduccion = Banco.hashMap.get(palabra);
            System.out.print(traduccion+" ");
        } else {
            System.out.print("*" + palabra + "* ");
        }
    }
    }
}
