
package entradasysalidas;

import javax.swing.JOptionPane;

public class EntradaFrame extends Entrada {
    @Override
    public String leer() {
        return JOptionPane.showInputDialog("Por favor, ingrese un valor en el frame:");
    }
}