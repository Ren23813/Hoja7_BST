import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class Pruebas {      //Por alguna razón, cuando se le da correr a toda la clase, lanza error; pero método por método, eso no sucede.

    @Test
    public void comprobarCorrectaAdhesion(){
    Controlador controlador = new Controlador();
    controlador.leerCompendio("compendio.txt");

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream customOut = new PrintStream(outputStream);
    PrintStream originalOut = System.out;
    System.setOut(customOut);
    
    controlador.todasLasPalabras();
    System.setOut(originalOut);
    String entrada = outputStream.toString().trim();
    String comprobar = "hello:hola yellow:amarillo";
    assertEquals(comprobar, entrada);
    }

    @Test
    public void comprobarCorrectaBusqueda(){
        Controlador controlador = new Controlador();
        controlador.setDefaults();

        String comprobar = "perro";
        assertEquals(comprobar,Controlador.banco.getTraduccion("DoG"));
    }

    @Test
    public void mostrarCorrectamenteTodoElTree(){
        Controlador controlador = new Controlador();
        controlador.setDefaults();
        String comprobar = "dog:perro homework:tarea house:casa town:pueblo woman:mujer yes:si";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream customOut = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(customOut);
        
        controlador.todasLasPalabras();
        System.setOut(originalOut);
        String entrada = outputStream.toString().trim();

        assertEquals(comprobar,entrada);

        controlador.leerCompendio("compendio.txt");
        comprobar = "dog:perro hello:hola homework:tarea house:casa town:pueblo woman:mujer yellow:amarillo yes:si";
        outputStream = new ByteArrayOutputStream();
        customOut = new PrintStream(outputStream);
        originalOut = System.out;
        System.setOut(customOut);
        
        controlador.todasLasPalabras();
        System.setOut(originalOut);
        entrada = outputStream.toString().trim();

        assertEquals(comprobar, entrada); 
    }

    @Test
    public void correctaTraduccionAlIniciar(){
        Controlador controlador = new Controlador();
        controlador.setDefaults();
        String comprobar = "*hello* pueblo mujer *potato*";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream customOut = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(customOut);
        controlador.translate("traducir.txt");
        System.setOut(originalOut);
        String entrada = outputStream.toString().trim();
        assertEquals(comprobar,entrada);
    }
}
