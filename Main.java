import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Controlador controlador = new Controlador();
		boolean mantener = true;

		controlador.setDefaults();

		while (mantener == true) {
		System.out.println("\nBienvenido a este traductor. Por favor, seleccione una opción: ");
		System.out.println("1. Mostrar todas las palabras registradas.");
		System.out.println("2. Mostrar la traducción de una palabra específica.");
		System.out.println("3. Leer un archivo para registrar más palabras. ");
		System.out.println("4. Leer un archivo para su traducción.");
		System.out.println("5. Salir.");

		String op = scan.nextLine();
		switch (op) {
			case "1":
				controlador.todasLasPalabras();
				break;
			case "2":
				System.out.println("Indique la palabra a traducir: ");
				String word = scan.nextLine();
				System.out.println(Controlador.banco.getTraduccion(word)); 	
				break;
			case "3":
				System.out.println("Indique el nombre del archivo que tiene el compendio de palabras y sus traducciones: ");
				String archivo = scan.nextLine();
				controlador.leerCompendio(archivo);
				System.out.println("Se leyó correctamente el archivo");
				break;
			case "4":
				System.out.println("Indique el nombre del archivo a traducir (considere que se lee únicamente la primera línea del archivo).");
				String archivo2 = scan.nextLine();
				System.out.print("\nTraducción:");
				controlador.translate(archivo2);	
				break;
			case "5":
				System.out.println("Saliendo...");
				System.exit(0);
			default:
				System.out.println("Seleccione una opción válida.");
				break;
		}

	}
  }		
}
