package Vista;

/* Importación de librerias/dependencias */
import javax.swing.*;
import Controladores.AdministradorArchivos;
import Controladores.Analizador;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THOMAS CAMILO VANEGAS ACEVEDO; ID:000287437
 * 
 */

public class AntivirusAppHome extends javax.swing.JFrame {
    
    private File archivo;
    private byte[] bytesArchivo;
    
    public AntivirusAppHome() {
        
        /* Ejecutando el método initComponents */
        initComponents();

        // Método que permite que el JFrame se inicie en el centro de la pantalla
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitleDetectorVirus = new javax.swing.JLabel();
        LblSeleccionarArchivoAnalizar = new javax.swing.JLabel();
        InputArchivo = new javax.swing.JTextField();
        BtnAnalizarArchivo = new javax.swing.JButton();
        LblContenidoArchivoBytes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaContenidoBytes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnBucarArchivo = new javax.swing.JButton();
        BtnMostrarAutomata = new javax.swing.JButton();
        Separator1 = new javax.swing.JSeparator();
        Separator2 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        BtnSalirApp = new javax.swing.JButton();
        LblNombreArchivo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblHayVirus = new javax.swing.JLabel();
        Separator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblHayUsama = new javax.swing.JLabel();
        LblHayAmtrax = new javax.swing.JLabel();
        LblHayAh1n1 = new javax.swing.JLabel();
        LblHayEbola = new javax.swing.JLabel();
        LblHayCovid19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LblCantUsama = new javax.swing.JLabel();
        LblCantAmtrax = new javax.swing.JLabel();
        LblCantAh1n1 = new javax.swing.JLabel();
        LblCantEbola = new javax.swing.JLabel();
        LblCantCovid19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblHayViruela = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        LblCantViruela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 710));

        LblTitleDetectorVirus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTitleDetectorVirus.setForeground(new java.awt.Color(20, 33, 61));
        LblTitleDetectorVirus.setText("Detector de Virus");

        LblSeleccionarArchivoAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblSeleccionarArchivoAnalizar.setText("Seleccione el Archivo a Analizar");

        InputArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputArchivoActionPerformed(evt);
            }
        });

        BtnAnalizarArchivo.setBackground(new java.awt.Color(252, 163, 17));
        BtnAnalizarArchivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAnalizarArchivo.setText("ANALIZAR ARCHIVO");
        BtnAnalizarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarArchivoActionPerformed(evt);
            }
        });

        LblContenidoArchivoBytes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblContenidoArchivoBytes.setText("Contenido de su Archivo en Bytes");

        TextAreaContenidoBytes.setColumns(20);
        TextAreaContenidoBytes.setRows(5);
        jScrollPane1.setViewportView(TextAreaContenidoBytes);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del Archivo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Estado del Autómata Finito");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Estado del Archivo");

        BtnBucarArchivo.setBackground(new java.awt.Color(252, 163, 17));
        BtnBucarArchivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnBucarArchivo.setText("Buscar Archivo a Analizar");
        BtnBucarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBucarArchivoActionPerformed(evt);
            }
        });

        BtnMostrarAutomata.setBackground(new java.awt.Color(252, 163, 17));
        BtnMostrarAutomata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnMostrarAutomata.setText("Mostrar Diseño Automata");
        BtnMostrarAutomata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarAutomataActionPerformed(evt);
            }
        });

        Separator1.setBackground(new java.awt.Color(0, 0, 0));
        Separator1.setForeground(new java.awt.Color(0, 0, 0));

        Separator2.setBackground(new java.awt.Color(0, 0, 0));
        Separator2.setForeground(new java.awt.Color(0, 0, 0));

        Separator4.setBackground(new java.awt.Color(0, 0, 0));
        Separator4.setForeground(new java.awt.Color(0, 0, 0));

        BtnSalirApp.setBackground(new java.awt.Color(252, 163, 17));
        BtnSalirApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSalirApp.setText("SALIR DE LA APP");
        BtnSalirApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirAppActionPerformed(evt);
            }
        });

        LblNombreArchivo.setText("Nombre Archivo...");

        jLabel6.setText("Estado del Autómata finito...");

        LblHayVirus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblHayVirus.setText("USAMA: ");

        Separator5.setBackground(new java.awt.Color(0, 0, 0));
        Separator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("AMTRAX:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("AH1N1:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("ÉBOLA:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("COVID-19:");

        LblHayUsama.setText("NO");

        LblHayAmtrax.setText("NO");

        LblHayAh1n1.setText("NO");

        LblHayEbola.setText("NO");

        LblHayCovid19.setText("NO");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("CANTIDAD:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("CANTIDAD:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("CANTIDAD:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("CANTIDAD:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("CANTIDAD:");

        LblCantUsama.setText("0");

        LblCantAmtrax.setText("0");

        LblCantAh1n1.setText("0");

        LblCantEbola.setText("0");

        LblCantCovid19.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("VIRUELA:");

        LblHayViruela.setText("NO");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("CANTIDAD:");

        LblCantViruela.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separator1)
            .addComponent(Separator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblHayVirus)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblHayUsama)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblCantUsama))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblHayAmtrax)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblCantAmtrax))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblHayAh1n1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblCantAh1n1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblHayEbola)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblCantEbola))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblHayCovid19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblCantCovid19))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblHayViruela)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(LblCantViruela)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(LblTitleDetectorVirus)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Separator2)
            .addComponent(Separator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBucarArchivo))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblSeleccionarArchivoAnalizar)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblContenidoArchivoBytes)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblNombreArchivo)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnSalirApp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMostrarAutomata, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnAnalizarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitleDetectorVirus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblSeleccionarArchivoAnalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBucarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblContenidoArchivoBytes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNombreArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblHayVirus)
                            .addComponent(LblHayUsama)
                            .addComponent(jLabel15)
                            .addComponent(LblCantUsama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(LblHayAmtrax)
                            .addComponent(jLabel16)
                            .addComponent(LblCantAmtrax))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LblHayAh1n1)
                            .addComponent(jLabel18)
                            .addComponent(LblCantAh1n1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LblHayEbola)
                            .addComponent(jLabel17)
                            .addComponent(LblCantEbola))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LblHayCovid19)
                            .addComponent(jLabel19)
                            .addComponent(LblCantCovid19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(LblHayViruela)
                            .addComponent(jLabel20)
                            .addComponent(LblCantViruela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addComponent(BtnAnalizarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalirApp)
                    .addComponent(BtnMostrarAutomata))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputArchivoActionPerformed
 
    // BOTÓN ANALIZAR ARCHIVO
    private void BtnAnalizarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarArchivoActionPerformed
 
        Analizador analizador = new Analizador(bytesArchivo);
        
        LblHayViruela.setText(analizador.analizarArchivo()[0]);
        LblHayUsama.setText(analizador.analizarArchivo()[1]);
        LblHayAmtrax.setText(analizador.analizarArchivo()[2]);
        LblHayAh1n1.setText(analizador.analizarArchivo()[3]);
        LblHayEbola.setText(analizador.analizarArchivo()[4]);
        LblHayCovid19.setText(analizador.analizarArchivo()[5]);
        
        LblCantViruela.setText(Integer.toString(analizador.contadorViruela));
        LblCantUsama.setText(Integer.toString(analizador.contadorUsama));
        LblCantAmtrax.setText(Integer.toString(analizador.contadorAmtrax));
        LblCantAh1n1.setText(Integer.toString(analizador.contadorAh1n1));
        LblCantEbola.setText(Integer.toString(analizador.contadorEbola));
        LblCantCovid19.setText(Integer.toString(analizador.contadorCovid19));
        
    }//GEN-LAST:event_BtnAnalizarArchivoActionPerformed
    
    
    private void BtnBucarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBucarArchivoActionPerformed

        // Instanciando la Clase JFileChooser;
        JFileChooser exploradorArchivos = new JFileChooser();
        
        String cadenaBytesArchivo = "";
        
        // Invocando el método showOpenDialog para abrir el buscador de archivos.
        exploradorArchivos.showOpenDialog(this);
        // Obteniedo la ruta para insertarse en el InputFile
        InputArchivo.setText(exploradorArchivos.getSelectedFile().toPath().toString());
        
        try {
            AdministradorArchivos administrador = new AdministradorArchivos(exploradorArchivos.getSelectedFile());
            
            bytesArchivo = administrador.getBytesArchivo();
            
            // Se recorre el array bytesArchivo para insertarlo en una cadena.
            for (int i = 0; i < bytesArchivo.length; i++) {
                
                cadenaBytesArchivo = cadenaBytesArchivo + bytesArchivo[i] + " ";
            
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(AntivirusAppHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TextAreaContenidoBytes.setText(cadenaBytesArchivo);
        
        String nombreArchivo = exploradorArchivos.getSelectedFile().getName();
        LblNombreArchivo.setText(nombreArchivo);
        
        
    }//GEN-LAST:event_BtnBucarArchivoActionPerformed

    private void BtnMostrarAutomataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarAutomataActionPerformed
        
        MostrarDisenoAutomata disenoAutomata = new MostrarDisenoAutomata();
        disenoAutomata.setVisible(true);
        
    }//GEN-LAST:event_BtnMostrarAutomataActionPerformed

    private void BtnSalirAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirAppActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_BtnSalirAppActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AntivirusAppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AntivirusAppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AntivirusAppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AntivirusAppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AntivirusAppHome().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizarArchivo;
    private javax.swing.JButton BtnBucarArchivo;
    private javax.swing.JButton BtnMostrarAutomata;
    private javax.swing.JButton BtnSalirApp;
    private javax.swing.JTextField InputArchivo;
    private javax.swing.JLabel LblCantAh1n1;
    private javax.swing.JLabel LblCantAmtrax;
    private javax.swing.JLabel LblCantCovid19;
    private javax.swing.JLabel LblCantEbola;
    private javax.swing.JLabel LblCantUsama;
    private javax.swing.JLabel LblCantViruela;
    private javax.swing.JLabel LblContenidoArchivoBytes;
    private javax.swing.JLabel LblHayAh1n1;
    private javax.swing.JLabel LblHayAmtrax;
    private javax.swing.JLabel LblHayCovid19;
    private javax.swing.JLabel LblHayEbola;
    private javax.swing.JLabel LblHayUsama;
    private javax.swing.JLabel LblHayViruela;
    private javax.swing.JLabel LblHayVirus;
    private javax.swing.JLabel LblNombreArchivo;
    private javax.swing.JLabel LblSeleccionarArchivoAnalizar;
    private javax.swing.JLabel LblTitleDetectorVirus;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JTextArea TextAreaContenidoBytes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
