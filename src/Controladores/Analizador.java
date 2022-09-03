package Controladores;

// Importando la libreria java.io;
import Modelo.Virus;
import javax.swing.JOptionPane;

/**
 *
 * @authors Thomas vanegas & Sara
 * 
 */

public class Analizador {
    
    // Atributos - Propiedades - Miembros Datos de la clase
    public byte[] contenidoBytes;
    public Virus[] listaVirus = new Virus[6];
    public byte[] bytesArchivo;
    
    public Integer contadorUsama = 0, contadorAmtrax = 0, contadorAh1n1 = 0,
                contadorEbola = 0, contadorCovid19 = 0, contadorViruela = 0;
    
    // Método Constructor de la clase
    public Analizador(byte[] contenidoBytes) {
        this.contenidoBytes = contenidoBytes;
    }

    public byte[] getBytesArchivo(){
        return this.bytesArchivo;
    };
    
    // Método privado que contiene la Base de Datos de los Virus a Analizar
    private void cargarVirus () {
    
        // Creación de la Base de Datos de Virus
        Virus usama = new Virus("USAMA", new byte [] {15, 30, 15, 49});
        Virus amtrax = new Virus("AMTRAX",new byte [] {72, 72, 15, 29});
        Virus eBola = new Virus("EBOLA", new byte [] {29, 32, 53, 29});
        Virus ah1n1 = new Virus("AH1N1", new byte [] {72, 32, 32, 20});
        Virus covid19 = new Virus("COVID-19", new byte [] {30, 25, 20, 19});
        Virus viruela = new Virus("VIRUELA", new byte [] {72,72,32,32});
       
        listaVirus [0] = usama;
        listaVirus [1] = amtrax;
        listaVirus [2] = eBola;
        listaVirus [3] = ah1n1;
        listaVirus [4] = covid19;
        listaVirus [5] = viruela;
    
    };
    
    public String[] analizarArchivo () {
        
        cargarVirus();
        
        // Contadores para cada Virus
        
        String hayViruela = "", hayUsama = "", hayAmtrax = "", hayAh1n1 = "",
                hayEbola = "", hayCovid19 = "";
        
        // Se Recorre el Array contenidoBytes
        for (int i = 0; i < contenidoBytes.length; i++) {
            
            // VIRUELA
            if (contenidoBytes[i] == listaVirus[5].getSecuenciaVirus()[0]) {                
                if (contenidoBytes[i + 1] == listaVirus[5].getSecuenciaVirus()[1]) {                
                    if (contenidoBytes[i + 2] == listaVirus[5].getSecuenciaVirus()[2]){                   
                        if (contenidoBytes[i + 3] == listaVirus[5].getSecuenciaVirus()[3]) {                        
                            contadorViruela += 1;
                            hayViruela = "SI";
                        }
                    }
                }               
            }
            
            // USAMA
            if (contenidoBytes[i] == listaVirus[0].getSecuenciaVirus()[0]) {              
                if (contenidoBytes[i + 1] == listaVirus[0].getSecuenciaVirus()[1]) {               
                    if (contenidoBytes[i + 2] == listaVirus[0].getSecuenciaVirus()[2]){                   
                        if (contenidoBytes[i + 3] == listaVirus[0].getSecuenciaVirus()[3]) {                        
                            contadorUsama += 1;
                            hayUsama = "SI";
                        }
                    }
                }               
            }
            
            // AMTRAX
            if (contenidoBytes[i] == listaVirus[1].getSecuenciaVirus()[0]) {                
                if (contenidoBytes[i + 1] == listaVirus[1].getSecuenciaVirus()[1]) {               
                    if (contenidoBytes[i + 2] == listaVirus[1].getSecuenciaVirus()[2]){                   
                        if (contenidoBytes[i + 3] == listaVirus[1].getSecuenciaVirus()[3]) {                       
                            contadorAmtrax += 1;
                            hayAmtrax = "SI";
                        }                  
                    }                
                }                
            }           
            
            // EBOLA
            if (contenidoBytes[i] == listaVirus[2].getSecuenciaVirus()[0]) {
                
                if (contenidoBytes[i + 1] == listaVirus[2].getSecuenciaVirus()[1]) {                
                    if (contenidoBytes[i + 2] == listaVirus[2].getSecuenciaVirus()[2]){                    
                        if (contenidoBytes[i + 3] == listaVirus[2].getSecuenciaVirus()[3]) {                       
                            contadorEbola += 1;
                            hayEbola = "SI";
                        }                    
                    }               
                }                
            }
            
            // AH1N1
            if (contenidoBytes[i] == listaVirus[3].getSecuenciaVirus()[0]) {               
                if (contenidoBytes[i + 1] == listaVirus[3].getSecuenciaVirus()[1]) {               
                    if (contenidoBytes[i + 2] == listaVirus[3].getSecuenciaVirus()[2]){                   
                        if (contenidoBytes[i + 3] == listaVirus[3].getSecuenciaVirus()[3]) {                       
                            contadorAh1n1 += 1;
                            hayAh1n1 = "SI";
                        }                    
                    }                
                }                
            }
            
            // COVID-19
            if (contenidoBytes[i] == listaVirus[4].getSecuenciaVirus()[0]) {               
                if (contenidoBytes[i + 1] == listaVirus[4].getSecuenciaVirus()[1]) {               
                    if (contenidoBytes[i + 2] == listaVirus[4].getSecuenciaVirus()[2]){                   
                        if (contenidoBytes[i + 3] == listaVirus[4].getSecuenciaVirus()[3]) {                      
                            contadorCovid19 += 1;
                            hayCovid19 = "SI";
                        }                    
                    }               
                }                
            } else{
                break;
              }
          
        // FIN DEL FOR
        }
        
        String[] estadoVirus = {hayViruela, hayUsama, hayAmtrax, hayAh1n1, hayEbola, hayCovid19};
        
        return estadoVirus;
    }   
}
