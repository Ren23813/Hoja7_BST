public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        System.out.println("Configuraciones iniciales de palabras, según la hoja de trabajo: ");
		banco.agregarPalabra("house", "casa");
		banco.agregarPalabra("dog", "perro");
		banco.agregarPalabra("homework", "tarea");
		banco.agregarPalabra("woman", "mujer");
		banco.agregarPalabra("town", "pueblo");
		banco.agregarPalabra("yes", "si");
		
		System.out.println("Se agregaron las palabras: house, dog, homework, woman, town, yes");
        
        System.out.println(banco.getTraduccion("HOUSE"));
		banco.getAllKeys();

		
	}

    }
