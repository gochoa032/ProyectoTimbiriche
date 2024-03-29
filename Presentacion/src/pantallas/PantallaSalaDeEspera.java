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
import javax.swing.JLabel;
import timbiriche.Cliente;
import timbiriche.Jugador;
import controles.SalaDeEspera;
import controles.IFacadaDeNegocio;
import java.awt.Font;

/**
 *
 * @author pc
 */
public class PantallaSalaDeEspera extends javax.swing.JDialog implements IObservador{

    private static PantallaSalaDeEspera pantallaSalaDeEspera;
    private List<Cliente> listaJugadores;
    private Cliente jugador;
    private int capacidadDePartida;
    private List<JLabel> listaLabels;
    private int puerto;
    //private String ip;
    private IFacadaDeNegocio facadaDeControl;
    private SalaDeEspera salaDeEspera;
    int ALTO_DE_PANEL;
    int ANCHO_DE_PANEL;
    int ALTO_DE_PANTALLA;
    int ANCHO_DE_PANTALLA;

    /**
     * 
     * @param parent
     * @param modal
     * @param jugador
     * @param listaJugadores 
     * @param capacidadDePartida 
     * @param facadaDeControl 
     */
    public PantallaSalaDeEspera(java.awt.Frame parent, boolean modal, 
            Cliente jugador, List<Cliente> listaJugadores, 
            int capacidadDePartida, IFacadaDeNegocio facadaDeControl) {
        super(parent, modal);
        initComponents();
        this.jugador = jugador;
        this.listaLabels = new ArrayList<>();
        this.listaJugadores = listaJugadores;
        this.facadaDeControl = facadaDeControl;
        this.capacidadDePartida = capacidadDePartida;
    }
    
    public void ajustarPantalla() {
        this.ANCHO_DE_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2;
        this.ALTO_DE_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;
        this.setSize((int)(this.ANCHO_DE_PANTALLA), (int)(this.ALTO_DE_PANTALLA));
        this.jPanel1.setSize((int)(ANCHO_DE_PANTALLA), (int)(ALTO_DE_PANTALLA));
        this.ANCHO_DE_PANEL = this.jPanel1.getWidth();
        this.ALTO_DE_PANEL = this.jPanel1.getHeight();
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * 
     */
    public void actualizarPantalla() {
        if(this.capacidadDePartida == this.listaJugadores.size()) {
            this.jButton_Preparado.setEnabled(true);
        }
        for (int i = listaLabels.size(); i < listaJugadores.size(); i++) {
            JLabel nuevoLabel = new JLabel();
            nuevoLabel.setHorizontalTextPosition(JLabel.CENTER);
            nuevoLabel.setVerticalTextPosition(JLabel.TOP);
            nuevoLabel.setHorizontalAlignment(JLabel.CENTER);
            nuevoLabel.setVerticalAlignment(JLabel.TOP);
            nuevoLabel.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 18));
            listaLabels.add(nuevoLabel);
        }
        int anchoLabel = this.ANCHO_DE_PANEL / this.listaLabels.size();
        int altoLabel = this.ALTO_DE_PANEL;
        double localizacionX = this.jPanel1.getLocation().getX();
        for (int i = 0; i < this.listaJugadores.size(); i++) {
            JLabel label = this.listaLabels.get(i);
            Jugador jugadorIterador = (Jugador)this.listaJugadores.get(i);
            this.jPanel1.add(label);
            label.setOpaque(true);
            label.setBackground(jugadorIterador.getColor());
            label.setSize(anchoLabel, altoLabel);
            label.setLocation((int)localizacionX, 0);
            localizacionX += anchoLabel;
            if (jugadorIterador.isPreparado()) {
                label.setIcon(jugadorIterador.getAvatar().getIcono());                
                label.setText("<html>"+jugadorIterador.getNombre()+"<br>"+"Listo</html>");
            } else {
                label.setIcon(jugadorIterador.getAvatar().getIcono());
                label.setText("<html>"+jugadorIterador.getNombre()+"<br>"+"No listo</html>");
            }
            
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Preparado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sala de Espera");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton_Preparado.setText("Iniciar Partida");
        jButton_Preparado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreparadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sala de Espera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton_Preparado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Preparado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PreparadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreparadoActionPerformed
        this.puerto = this.salaDeEspera.getPuerto();
        this.facadaDeControl.setPreparado(this.jugador, this.puerto);
    }//GEN-LAST:event_jButton_PreparadoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    /**
     * 
     * @return 
     */
    public boolean isJugadoresPreparados() {
        if (this.listaJugadores.size() == 4) {
            for (Cliente jugadorIterador : this.listaJugadores) {
                ((Jugador) jugadorIterador).setPreparado(true);
            }
            return true;
        }
        
        for (Cliente jugadorIterador: this.listaJugadores) {
            if(!((Jugador)jugadorIterador).isPreparado()) {
                return false;
            }
        }
        return true;
    }

    public void mostrarPantalla() {
        ajustarPantalla();
        this.jPanel1.removeAll();
        //this.listaJugadores.clear();
        this.listaLabels.clear();
        this.jButton_Preparado.setEnabled(false);
        this.setVisible(true);
    }

    /**
     * 
     * @param jugador 
     */
    public void setJugador(Cliente jugador) {
        this.jugador = jugador;
    }
    
    public void setListaJugadores(List<Cliente> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void setCapacidadDePartida(int capacidadDePartida) {
        this.capacidadDePartida = capacidadDePartida;
    }

    public List<Cliente> getListaJugadores() {
        return listaJugadores;
    }

    public Cliente getJugador() {
        return jugador;
    }

    public int getCapacidadDePartida() {
        return capacidadDePartida;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public SalaDeEspera getSalaDeEspera() {
        return salaDeEspera;
    }

    public void setSalaDeEspera(SalaDeEspera salaDeEspera) {
        this.salaDeEspera = salaDeEspera;
    }  
    
    /**
     * 
     * @param parent
     * @param modal
     * @param jugador
     * @param listaJugadores
     * @param capacidadDePartida
     * @param facadaDeControl
     * @return
     */
    public static PantallaSalaDeEspera getInstacia(Frame parent, boolean modal,
            Cliente jugador, List<Cliente> listaJugadores, int capacidadDePartida,
            IFacadaDeNegocio facadaDeControl) {
        if (pantallaSalaDeEspera == null) {
            pantallaSalaDeEspera = new PantallaSalaDeEspera(parent, modal, jugador, listaJugadores, capacidadDePartida,facadaDeControl);
        } else {
            pantallaSalaDeEspera.setJugador(jugador);
            pantallaSalaDeEspera.setCapacidadDePartida(capacidadDePartida);
            pantallaSalaDeEspera.setListaJugadores(listaJugadores);
            
        }
        try {
            pantallaSalaDeEspera.setSalaDeEspera(new SalaDeEspera(pantallaSalaDeEspera.getJugador(), pantallaSalaDeEspera.getListaJugadores(), pantallaSalaDeEspera.getPuerto()));
            pantallaSalaDeEspera.getSalaDeEspera().agregarObservador(pantallaSalaDeEspera);
        } catch (IOException ex) {
            Logger.getLogger(PantallaSalaDeEspera.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pantallaSalaDeEspera;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Preparado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {
        this.actualizarPantalla();
        ((Jugador)this.jugador).setColor(((Jugador)this.listaJugadores.get(this.listaJugadores.indexOf(this.jugador))).getColor());
        if (this.isJugadoresPreparados()) {
            this.setVisible(false);
        }
    }
}
