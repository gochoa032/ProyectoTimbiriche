/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import timbiriche.IObservador;
import java.awt.Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import timbiriche.Cliente;
import controles.SeleccionPartida;
import controles.IFacadaDeNegocio;

/**
 *
 * @author pc
 */
public class PantallaSeleccionarPartida extends javax.swing.JDialog implements IObservador {

    private static PantallaSeleccionarPartida pantallaSeleccionarPartida;
    private Cliente jugador;
    private List<String> partidas;
    private List datosPartida;
    private IFacadaDeNegocio facadaDeNegocio;
    
    /**
     * 
     * @param parent
     * @param modal
     * @param jugador 
     * @param datosPartida 
     * @param facadaDeNegocio 
     */
    public PantallaSeleccionarPartida(java.awt.Frame parent, boolean modal, Cliente jugador, List datosPartida, IFacadaDeNegocio facadaDeNegocio) {
        super(parent, modal);
        initComponents();
        this.jugador = jugador;
        this.datosPartida = datosPartida;
        this.facadaDeNegocio = facadaDeNegocio;
        this.partidas = new ArrayList<>();
    }

    private List<String> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<String> partidas) {
        this.partidas = partidas;
    }

    public List getDatosPartida() {
        return datosPartida;
    }

    public void setDatosPartida(List datosPartida) {
        this.datosPartida = datosPartida;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_SeleccionarPartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_SeleccionarPartida.setText("Seleccionar");
        jButton_SeleccionarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SeleccionarPartidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Partidas Disponibles");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButton_SeleccionarPartida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton_SeleccionarPartida)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SeleccionarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SeleccionarPartidaActionPerformed
        if(jTable1.getSelectedRow() >= 0) {
            this.datosPartida.clear();
            this.datosPartida.add(jTable1.getValueAt(jTable1.getSelectedRow(),2));
            this.datosPartida.add(jTable1.getValueAt(jTable1.getSelectedRow(),3));

            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_SeleccionarPartidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SeleccionarPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void mostrarPantalla() {
        this.setVisible(true);
    }
    /**
     * 
     * @param parent
     * @param modal
     * @param jugador
     * @param datosDePartida
     * @param facadaDeNegocio
     * @return 
     */
    public static PantallaSeleccionarPartida getInstacia(Frame parent, boolean modal, Cliente jugador, List datosDePartida, IFacadaDeNegocio facadaDeNegocio) {
        if (pantallaSeleccionarPartida == null) {
            pantallaSeleccionarPartida = new PantallaSeleccionarPartida(parent, modal, jugador, datosDePartida, facadaDeNegocio);
        }
        Thread hiloSeleccionPartida;        
        try {
            SeleccionPartida seleccionPartida = new SeleccionPartida(jugador, pantallaSeleccionarPartida.getPartidas());
            seleccionPartida.agregarObservador(pantallaSeleccionarPartida);
            hiloSeleccionPartida = new Thread(seleccionPartida);
            hiloSeleccionPartida.start();
            facadaDeNegocio.obtenerPartidas(jugador, jugador.getIpCliente());
            pantallaSeleccionarPartida.setDatosPartida(datosDePartida);
        } catch (IOException ex) {
            Logger.getLogger(PantallaSeleccionarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pantallaSeleccionarPartida;
    }
    /**
     * 
     * @param partidas 
     */
    public void actualizarTabla(List<String> partidas) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre de Jugador","Cupos Disponibles","Capacidad de Partida", "Ip", "Puerto"});
        for (String partida : partidas) {
            dtm.addRow(partida.split(","));
        }
        jTable1.setModel(dtm);
    }

    @Override
    public void actualizar() {
        this.actualizarTabla(partidas);
    }
}
