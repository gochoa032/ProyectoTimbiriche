/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import pantallas.PaginaDeInicio;

/**
 *
 * @author gateway1
 */
public class SalirCommand implements Command {
    private PaginaDeInicio pantalla;
    
    public SalirCommand(PaginaDeInicio pantalla) {
        this.pantalla = pantalla;
    }
    
    @Override
    public void execute() {
        pantalla.dispose();
        System.exit(0);
    }
    
}
