package Controladores;

// Importando la libreria java.io;
import Modelo.Virus;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */

public class Analizador {
    
    // Atributos - Propiedades - Miembros Datos de la clase
    private byte[] contenidoBytes;
    private Virus[] listaVirus;
    private byte[] bytesArchivo;
    
    // Método Constructor de la clase

    public Analizador(byte[] contenidoBytes) {
        this.contenidoBytes = contenidoBytes;
    }

    
    
    // Métodos de la clase
    public boolean analizarArchivo () {
        
        cargarVirus();
        
        for (int i = 0; i < contenidoBytes.length; i++) {
            
            // USAMA
            if (contenidoBytes[i] == listaVirus[0].getSecuenciaVirus()[0]) {
                
                if (contenidoBytes[i + 1] == listaVirus[0].getSecuenciaVirus()[1]) {
                
                    if (contenidoBytes[i + 2] == listaVirus[0].getSecuenciaVirus()[2]){
                    
                        if (contenidoBytes[i + 3] == listaVirus[0].getSecuenciaVirus()[3]) {
                        
                            JOptionPane.showMessageDialog(null, "SE ENCONTRÓ EL VIRUS USAMA");
                        
                        }
                    
                    }
                
                }
                
            }
            
            // AMTRAX
            if (contenidoBytes[i] == listaVirus[1].getSecuenciaVirus()[0]) {
                
                if (contenidoBytes[i + 1] == listaVirus[1].getSecuenciaVirus()[1]) {
                
                    if (contenidoBytes[i + 2] == listaVirus[1].getSecuenciaVirus()[2]){
                    
                        if (contenidoBytes[i + 3] == listaVirus[1].getSecuenciaVirus()[3]) {
                        
                            JOptionPane.showMessageDialog(null, "SE ENCONTRÓ EL VIRUS AMTRAX");
                        
                        }
                    
                    }
                
                }
                
            }
            
        }
        
        return true;
    }
    
    private void cargarVirus () {
    
        Virus usama = new Virus("USAMA", new byte [] {15, 30, 15, 49});
        Virus amtrax = new Virus("AMTRAX",new byte [] {72, 72, 15, 29});
        Virus eBola = new Virus("EBOLA", new byte [] {29, 32, 53, 29});
        Virus ah1n1 = new Virus("AH1N1", new byte [] {72, 32, 32, 20});
        Virus covid = new Virus("COVID-19", new byte [] {30, 25, 20, 19});
        
        listaVirus [0] = usama;
        listaVirus [1] = amtrax;
        listaVirus [2] = eBola;
        listaVirus [3] = ah1n1;
        listaVirus [4] = covid;
    
    }
    
}
