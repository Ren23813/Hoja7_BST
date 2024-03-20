import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
		Lector lector = new Lector();
        Scanner scan = new Scanner(System.in);

        System.out.println("Configuraciones iniciales de palabras, según la hoja de trabajo: ");
		banco.agregarPalabra("house", "casa");
		banco.agregarPalabra("dog", "perro");
		banco.agregarPalabra("homework", "tarea");
		banco.agregarPalabra("woman", "mujer");
		banco.agregarPalabra("town", "pueblo");
		banco.agregarPalabra("yes", "si");
		System.out.println("Se agregaron las palabras: house, dog, homework, woman, town, yes");
        

        System.out.println(banco.getTraduccion("HOUSE"));
		banco.getAllWords();
		
		System.out.println("Indique el nombre del archivo que tiene el compendio de palabras y sus traducciones: ");
		String archivo = scan.nextLine();
		lector.leerArchivoBase(archivo);
		for (int i = 0; i < lector.keys.length; i++) {
			banco.agregarPalabra(lector.keys[i], lector.values[i]);			
		}
		banco.getAllWords();
		
		System.out.println(banco.getTraduccion("HELLO"));

	}

    }
