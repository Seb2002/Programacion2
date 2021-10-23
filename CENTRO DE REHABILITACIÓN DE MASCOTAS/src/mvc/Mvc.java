/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.Controlador;
import controlador.ControladorAgregar;
import modelo.modelo;
import vista.Vista;
import vista.VistaAgregar;

/**
 *
 * @author BRAYAN
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelo model=new modelo();
        Vista vis = new Vista();
        VistaAgregar visa = new VistaAgregar();
        Controlador control=new Controlador(vis,model);
        
        
        control.iniciar();
        
        vis.setVisible(true);
        
    }
    
}
