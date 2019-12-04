/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import pantallas.PaginaDeInicio;
import java.util.ArrayList;
import java.util.List;
import timbiriche.Jugador;
/**
 *
 * @author pc
 */
public class Timbiriche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaginaDeInicio pa = new PaginaDeInicio();
        pa.setVisible(true);
//        try {
//            Avatar avatarPrueba = new Avatar();
//            avatarPrueba.setImagen(new File("src/img/AvatarPrueba.png"));
//            
//            Avatar avatarPrueba2 = new Avatar();
//            avatarPrueba2.setImagen(new File("src/img/AvatarPrueba_1.png"));
//            
//            Avatar avatarPrueba3 = new Avatar();
//            avatarPrueba3.setImagen(new File("src/img/AvatarPrueba_2.png"));
//            
//            Avatar avatarPrueba4 = new Avatar();
//            avatarPrueba4.setImagen(new File("src/img/AvatarPrueba_3.png"));
//            
//            Jugador jugador1 = new Jugador("Juan", Color.BLACK);
//            Jugador jugador2 = new Jugador("Jose", Color.BLUE);
//            Jugador jugador3 = new Jugador("Manuel", Color.CYAN);
//            Jugador jugador4 = new Jugador("Jesus", Color.GRAY);
//            
//            List<Jugador> listaDeJugadores = new ArrayList<>(4);
//            listaDeJugadores.add(jugador1);
//            listaDeJugadores.add(jugador2);
//            listaDeJugadores.add(jugador3);
//            listaDeJugadores.add(jugador4);
//            
//            listaDeJugadores = crearTurnos(listaDeJugadores);
//            
//            JFrame frameJuego = new FrameJuego(listaDeJugadores);
//            frameJuego.setVisible(true);
//        } catch (IOException ex) {
//            Logger.getLogger(Timbiriche.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public static List<Jugador> crearTurnos(List<Jugador> listaDeJugadores) {
        List<Jugador> listaConTurnos = new ArrayList<>();
        int numero;
        Jugador jugador;
        for (int i = listaDeJugadores.size()-1; i >= 0; i--) {
            numero = (int)(Math.random()*(i+1));
            jugador = listaDeJugadores.remove(numero);
            listaConTurnos.add(jugador);
        }
        return listaConTurnos;
    }
    
}
