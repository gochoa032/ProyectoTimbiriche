/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import timbiriche.ColorJugador;
import timbiriche.Linea;
import timbiriche.Parser;

/**
 *
 * @author Email
 */
public class Prueba {
    
    public Prueba() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void parser() {
        Linea l = new Parser("1,25,300,4,AMARILLO").evaluate();
        int x0 = l.getEjeXPuntoInicial();
        int y0 = l.getEjeYPuntoInicial();
        int x1 = l.getEjeXPuntoFinal();
        int y1 = l.getEjeYPuntoFinal();
        Color c = l.getColor();
        
        assertEquals(x0, 1);
        assertEquals(y0, 25);
        assertEquals(x1, 300);
        assertEquals(y1, 4);
        assertEquals(c, ColorJugador.AMARILLO.getColor());
    }
}
