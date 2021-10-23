/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.modelo;
import vista.Vista;
import vista.VistaAgregar;

/**
 *
 * @author BRAYAN
 */
public class ControladorAgregar implements ActionListener {
    
    int numMas=0;
    private VistaAgregar va;
    private modelo m;
    modelo mo = new modelo();
    String x;
    public ControladorAgregar(VistaAgregar va, modelo m) {
        
     this.va = va;
    this.m=m;
    this.va.btnGato.addActionListener(this);
    this.va.btnPerro.addActionListener(this);
    this.va.btnAtras.addActionListener(this);
    this.va.btnGuardar.addActionListener(this);
    this.va.Volver.addActionListener(this);
    }
    public void iniciar(){
        va.combo1.setVisible(false);
        va.btnAtras.setVisible(false);
        va.jPanel1.setVisible(false);
    va.setTitle("Agregar Mascota");
    va.setLocationRelativeTo(null);
    }
     public void actionPerformed(ActionEvent e) {
         va.combo1.setVisible(true);
         va.btnAtras.setVisible(true);
         va.jPanel1.setVisible(true);
        if(e.getSource()==va.btnGato){
           x =va.btnGato.getText(); 
          va.btnPerro.setVisible(false);
          va.variable.setText("¿el gato tiene toxoplasmosis?");
          va.combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no", }));

        }
        
        if(e.getSource()==va.btnPerro){
             x =va.btnPerro.getText();
         va.btnGato.setVisible(false);
          va.variable.setText("¿que nivel de entrenamiento tiene el perro?");
          va.combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2","3","4","5","6","7","8","9","10" }));
        }
        if(e.getSource()==va.btnAtras){
            
            
            va.variable.setText("");
        va.btnGato.setVisible(true);
        va.btnPerro.setVisible(true);
         va.combo1.setVisible(false);
        va.btnAtras.setVisible(false);
        va.jPanel1.setVisible(false);
       
        }
        if(e.getSource()==va.Volver){
            modelo model=new modelo();
        Vista vis = new Vista();
        Vista v = new Vista();
         Controlador control=new Controlador(vis,model);
         
         vis.setVisible(true);
        va.setVisible(false);
        control.iniciar();
        }
         if(e.getSource()==va.btnGuardar){
             
             
             numMas=numMas+1;
        
          mo.setNumMascotas(numMas);
          System.out.print(mo.getNumMascotas());
          String mascotas[]=new String[mo.getNumMascotas()];
          
          if(x.equals(va.btnGato.getText())){
          mascotas[numMas-1]="tiene toxoplasmosis? "+va.combo1.getSelectedItem().toString()+"\n Nombre:"+ va.tNombre.getText()+"\n Raza:"+va.tRaza.getText()+"\n Color:"+va.tColor.getText()+"\n Edad:"+va.tEdad.getText();
           
        
         }
          if(x.equals(va.btnPerro.getText())){
         mascotas[numMas-1]="nivel de entrenamiento "+va.combo1.getSelectedItem().toString()+"\n Nombre:"+ va.tNombre.getText()+"\n Raza:"+va.tRaza.getText()+"\n Color:"+va.tColor.getText()+"\n Edad:"+va.tEdad.getText();
         }    
        System.out.println(": "+mascotas[numMas-1]);
        va.tColor.setText("");
        va.tEdad.setText("");
        va.tNombre.setText("");
        va.tRaza.setText("");
        mo.mascotas=mascotas;
        }
     }
}
