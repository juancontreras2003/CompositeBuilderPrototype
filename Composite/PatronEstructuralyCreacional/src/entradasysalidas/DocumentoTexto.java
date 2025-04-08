
package entradasysalidas;

/**
 *
 * @author juanc
 */
public class DocumentoTexto extends ComponenteDocumento {
    private String contenido;

    public DocumentoTexto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void mostrar() {
        System.out.println(contenido);
    }

    @Override
    public ComponenteDocumento clonar() {
        return new DocumentoTexto(this.contenido);
    }
}