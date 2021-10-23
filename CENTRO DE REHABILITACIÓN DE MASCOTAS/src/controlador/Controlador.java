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
public class Controlador implements ActionListener {

   

    private Vista v;
    private modelo m;
    VistaAgregar va = new VistaAgregar();
    ControladorAgregar conta =new ControladorAgregar(va,m);
    
    vistaConsultar vc = new vistaConsultar();
    controladorConsultar contc = new controladorConsultar(vc,m);
    
    public Controlador(Vista v, modelo m) {
        
     this.v = v;
    this.m=m;
    this.v.btnConsultar.addActionListener(this);
    this.v.btnAgregar.addActionListener(this);
    }
    public void iniciar(){
    v.setTitle("app mascotas");
    v.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==v.btnAgregar){
           
        v.setVisible(false);
        va.setVisible(true);
        conta.iniciar();
        }
        
        if(e.getSource()==v.btnConsultar){
        v.setVisible(false);
        vc.setVisible(true);
        contc.iniciar();
        }
        }
   
}
