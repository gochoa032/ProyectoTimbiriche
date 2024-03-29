/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import controles.IFacadaDeNegocio;
import java.util.ArrayList;
import java.util.List;
import timbiriche.Cliente;
import timbiriche.Jugador;

/**
 *
 * @author gateway1
 */
public class UnirsePartidaCommand implements Command {
    private PaginaDeInicio pantalla;
    
    public UnirsePartidaCommand(PaginaDeInicio pantalla) {
        this.pantalla = pantalla;
    }
    
    @Override
    public void execute() {
        Cliente jugador = pantalla.obtenerJugador();
        ((Jugador) jugador).setPreparado(false);
        
        IFacadaDeNegocio facadaDeControl = pantalla.obtenerFacadaControl();
        
        List datosPartida = new ArrayList<>();
        PantallaSeleccionarPartida pantallaSeleccionarPartida = PantallaSeleccionarPartida.getInstacia(pantalla, true, jugador, datosPartida, facadaDeControl);
        pantallaSeleccionarPartida.mostrarPantalla();
        //si selecciono algo
        if(!datosPartida.isEmpty()) {
            int capacidad = Integer.parseInt((String) datosPartida.get(0));
            String ip = (String) datosPartida.get(1);
            List<Cliente> listaDeJugadores = new ArrayList<>();
            PantallaSalaDeEspera pantallaSalaDeEspera = PantallaSalaDeEspera.getInstacia(pantalla, true, jugador, listaDeJugadores, capacidad, facadaDeControl);
            facadaDeControl.unirseAPartida(jugador, ip);
            pantallaSalaDeEspera.mostrarPantalla();

    //        FrameJuego frameJuego = FrameJuego.getInstacia(listaDeJugadores, jugador, facadaDeControl);
            FrameJuego frameJuego = new FrameJuego(listaDeJugadores, jugador, facadaDeControl);
            frameJuego.mostrarPantalla();
        }
    }
    
}
