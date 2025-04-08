
package entradasysalidas;

public class FabricaFrame extends FabricaMedios {
    @Override
    public Entrada crearEntrada() {
        return new EntradaFrame();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaFrame();
    }
}