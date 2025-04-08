
package entradasysalidas;

/**
 *
 * @author Estudiantes
 */
public class SalidaConsola extends Salida {
    @Override
    public void mostrar(String mensaje) {
        System.out.println("Mostrando en la consola: " + mensaje);
    }
}