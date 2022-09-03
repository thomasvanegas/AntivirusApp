package Modelo;

/**
 *
 * @author LENOVO
 */
public class Virus {
    
    // Propiedades - Atributos - Miembros Dato de la clase Virus
    private String nombreVirus;
    private byte[] secuenciaVirus; 
    
    // Método Constructor
    public Virus (String nombreVirus, byte[] secuenciaVirus){
        this.nombreVirus = nombreVirus;
        this.secuenciaVirus = secuenciaVirus;
    }
    
    // Métodos de acceso (accesores) Getters de la Clase
    public String getNombreVirus(){    
        return this.nombreVirus;
    }
    
    public byte[] getSecuenciaVirus(){
        return this.secuenciaVirus;
    }
    
}
