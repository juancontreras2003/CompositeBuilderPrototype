/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entradasysalidas;

/**
 *
 * @author juanc
 */
public class DirectorDocumento {
    
    public DocumentoCompuesto crearDocumentoCompleto() {
        return new DocumentoBuilder()
                .agregarTitulo("Documento Completo")
                .agregarParrafo("Este es un párrafo detallado del documento.")
                .agregarImagen("Imagen de ejemplo")
                .crearDocumento();
    }

    public DocumentoCompuesto crearDocumentoSimple() {
        return new DocumentoBuilder()
                .agregarTitulo("Documento Simple")
                .agregarParrafo("Este es un párrafo simple.")
                .crearDocumento();
    }
}