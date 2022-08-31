package Controladores;

// Importando la libreria java.io;
import java.io.*;
import Modelo.Virus; 

/**
 *
 * @author LENOVO
 */

public class Analizador {
    
    // Atributos - Propiedades - Miembros Datos de la clase
    private File archivo;
    private byte[] contenidoBytes;
    private Virus [] listaVirus;
    
    // Método Constructor de la clase

    public Analizador(File archivo) {
        this.archivo = archivo;
    }
    
    
    // Métodos de la clase
    private boolean analizarArchivo () {
        
        // Implementación del método
        return true;
        
    }
    
}
