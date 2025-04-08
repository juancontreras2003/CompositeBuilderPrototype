package entradasysalidas;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan y Chatgpt
 */
public class EntradasySalidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de salida:");
        System.out.println("1. Consola");
        System.out.println("2. Gráfica");
        
        int opcion = scanner.nextInt();
        FabricaSalida fabricaSalida = null;
        
        if (opcion == 1) {
            fabricaSalida = new FabricaConsola();
        } else if (opcion == 2) {
            fabricaSalida = new FabricaFrame();
        } else {
            System.out.println("Opción no válida, usando consola por defecto.");
            fabricaSalida = new FabricaConsola();
        }

        // Usando la fábrica para crear la salida
        Salida salida = fabricaSalida.crearSalida();
        
        // Crear un documento de ejemplo
        DirectorDocumento director = new DirectorDocumento();
        DocumentoCompuesto documento = director.crearDocumentoCompleto();

        // Obtener contenido del documento como un String
        String contenido = obtenerContenidoDelDocumento(documento);
        
        // Mostrar el contenido usando la salida elegida
        salida.mostrar(contenido);
    }

    private static String obtenerContenidoDelDocumento(DocumentoCompuesto documento) {
        StringBuilder contenido = new StringBuilder();
        for (ComponenteDocumento doc : documento.getDocumentos()) {
            contenido.append(((DocumentoTexto) doc).getContenido()).append("\n");
        }
        return contenido.toString();
    }
}