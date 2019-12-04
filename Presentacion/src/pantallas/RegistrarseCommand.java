/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;


/**
 *
 * @author gateway1
 */
public class RegistrarseCommand implements Command {
    private PaginaDeInicio pantalla;
    
    public RegistrarseCommand(PaginaDeInicio pantalla) {
        this.pantalla = pantalla;
    }
    
    @Override
    public void execute() {
        PantallaRegistro pantallaRegistroJugador = PantallaRegistro.getInstacia(pantalla, true, pantalla.obtenerJugador(), pantalla.obtenerFacadaControl());
        pantallaRegistroJugador.mostrarPantalla();
        pantalla.actualizarPantalla();
    }
    
}
