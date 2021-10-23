/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.Vista;
import vista.VistaAgregar;
import vista.vistaConsultar;

/**
 *
 * @author BRAYAN
 */
public class controladorConsultar implements ActionListener {
    private VistaAgregar va;
    private modelo m;
    private vistaConsultar vc;
    modelo mo = new modelo();
    
    public controladorConsultar(vistaConsultar vc, modelo m) {
        
     this.vc = vc;
    this.m=m;
    this.vc.Volver.addActionListener(this);
    this.vc.buscar.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vc.Volver){
        modelo model=new modelo();
        Vista vis = new Vista();
        Vista v = new Vista();
         Controlador control=new Controlador(vis,model);
         
         vis.setVisible(true);
        vc.setVisible(false);
        control.iniciar();
        }
        if(e.getSource()==vc.buscar){
        vc.mostrar.setText(mo.mascotas.toString());
        }
    }

    void iniciar() {
        vc.setTitle("consultar mascotas");
    vc.setLocationRelativeTo(null);
    }
    
}
