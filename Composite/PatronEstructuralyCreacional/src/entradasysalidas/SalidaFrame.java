package entradasysalidas;

import javax.swing.JOptionPane;

public class SalidaFrame extends Salida {
    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, "Mostrando en el frame: " + mensaje);
    }
}