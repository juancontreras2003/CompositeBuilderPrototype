package entradasysalidas;

/**
 *
 * @author juanc
 */
public class DocumentoBuilder {
    private DocumentoCompuesto documento = new DocumentoCompuesto();

    public DocumentoBuilder agregarTitulo(String titulo) {
        documento.agregar(new DocumentoTexto("Título: " + titulo));
        return this;
    }

    public DocumentoBuilder agregarParrafo(String parrafo) {
        documento.agregar(new DocumentoTexto("Párrafo: " + parrafo));
        return this;
    }

    public DocumentoBuilder agregarImagen(String imagen) {
        documento.agregar(new DocumentoTexto("Imagen: " + imagen));
        return this;
    }

    public DocumentoCompuesto crearDocumento() {
        return documento;
    }
}