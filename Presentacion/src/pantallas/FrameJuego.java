/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import timbiriche.IObservador;
import java.util.List;
import javax.swing.JPanel;
import timbiriche.Cliente;
import controles.IFacadaDeNegocio;

/**
 *
 * @author pc
 */
public class FrameJuego extends javax.swing.JFrame implements IObservador {
    
    private static FrameJuego frameJuego;
    private Lienzo lienzo;
    private List<Cliente> listaJugadores;
    
    /**
     * Creates new form frameJuego
     * @param listaDeJugadores
     * @param jugador
     * @param facadaDeNegocio
     */
    public FrameJuego(List<Cliente> listaDeJugadores, Cliente jugador, IFacadaDeNegocio facadaDeNegocio) {
        initComponents();
        this.setSize(1300, 950);
        this.listaJugadores = listaDeJugadores;
        lienzo = new Lienzo(this.listaJugadores, jugador, facadaDeNegocio);
        lienzo.setLocation(25, 25);
        lienzo.agregarObservador(this);
        JPanel panelPuntuacion = lienzo.getPanel();
        panelPuntuacion.setLocation(900,25);
        this.add(panelPuntuacion);
        this.add(lienzo);
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timbiriche");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static FrameJuego getInstacia(List<Cliente> listaDeJugadores, Cliente jugador, IFacadaDeNegocio facadaDeNegocio) {
        if (frameJuego == null) {
            frameJuego = new FrameJuego(listaDeJugadores, jugador, facadaDeNegocio);
        } else {
            frameJuego.setListaJugadores(listaDeJugadores);
        }
        return frameJuego;
    }
    
    public void setListaJugadores(List<Cliente> listaDeJugadores) {
        this.listaJugadores.clear();
        this.listaJugadores.addAll(listaDeJugadores);
    }

    public void mostrarPantalla() {
        lienzo.prepararLienzo();
        this.setVisible(true);
    }

    @Override
    public void actualizar() {
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
