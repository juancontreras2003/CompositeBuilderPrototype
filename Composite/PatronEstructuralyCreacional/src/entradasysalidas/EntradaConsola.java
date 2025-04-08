package entradasysalidas;

/**
 *
 * @author Estudiantes
 */
import java.util.Scanner;

public class EntradaConsola extends Entrada {
    private Scanner scanner;

    public EntradaConsola() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String leer() {
        System.out.println("Por favor, ingrese un valor en la consola:");
        return scanner.nextLine();
    }
}