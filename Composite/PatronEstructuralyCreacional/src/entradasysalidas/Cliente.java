package entradasysalidas;
/**
 *
 * @author Juan
 */
public class Cliente {
    private Entrada entrada;
    private Salida salida;

    public Cliente(FabricaMedios fabrica) {
        entrada = fabrica.crearEntrada();
        salida = fabrica.crearSalida();
    }

    public void realizarOperacion() {
        String dato = entrada.leer();
        salida.mostrar(dato);
    }
}