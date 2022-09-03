package Controladores;

// Se importa el package java.io;
import java.io.*;
import java.nio.file.Files;

/**
 *
 * @author LENOVO
 */

public class AdministradorArchivos {
    
    // Atributos - Propiedades - Miembros Datos de la clase
    private File archivo;
    private byte[] bytesArchivo;

    public AdministradorArchivos() {
    }

    public AdministradorArchivos(File archivo) throws IOException {
        this.archivo = archivo;
        leerArchivo();
    };
    
    // Método Getter del atributo bytesArchivo;
    public byte[] getBytesArchivo(){
        return this.bytesArchivo;
    };
    
    // Métodos de la clase AdministradorArchivos
    public void leerArchivo () throws IOException{      
        // Se convierte el archivo a un arreglo de bytes
        bytesArchivo = Files.readAllBytes(archivo.toPath());
    };
        
}
