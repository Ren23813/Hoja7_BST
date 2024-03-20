import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Controlador controlador = new Controlador();


		controlador.setDefaults();
		controlador.todasLasPalabras();		//+++++++++++++++++++++++++++
        System.out.println(Controlador.banco.getTraduccion("HOUSE")); 	//+++++++++++++++++++
		
		System.out.println("Indique el nombre del archivo que tiene el compendio de palabras y sus traducciones: ");
		String archivo = scan.nextLine();
		controlador.leerCompendio(archivo);
		
		
		System.out.println(Controlador.banco.getTraduccion("HELLO"));	//+++++++++++++
		controlador.todasLasPalabras();		//+++++++++++++++++++

		System.out.println("Indique el nombre del archivo a traducir");
		String archivo2 = scan.nextLine();
		controlador.translate(archivo2);
	}

    }
