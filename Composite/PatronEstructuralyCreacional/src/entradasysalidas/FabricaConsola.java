
package entradasysalidas;

/**
 *
 * @author Estudiantes
 */
public class FabricaConsola extends FabricaMedios {
    @Override
    public Entrada crearEntrada() {
        return new EntradaConsola();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaConsola();
    }
}