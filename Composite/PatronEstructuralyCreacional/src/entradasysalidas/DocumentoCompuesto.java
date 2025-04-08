/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entradasysalidas;

import java.util.ArrayList;
import java.util.List;

public class DocumentoCompuesto extends ComponenteDocumento {
    private List<ComponenteDocumento> documentos = new ArrayList<>();

    public void agregar(ComponenteDocumento documento) {
        documentos.add(documento);
    }

    @Override
    public void mostrar() {
        for (ComponenteDocumento doc : documentos) {
            doc.mostrar();
        }
    }

    @Override
    public ComponenteDocumento clonar() {
        DocumentoCompuesto clonado = new DocumentoCompuesto();
        for (ComponenteDocumento doc : documentos) {
            clonado.agregar(doc.clonar());
        }
        return clonado;
    }

    public List<ComponenteDocumento> getDocumentos() {
        return documentos;
    }
}