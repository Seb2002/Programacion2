/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.VistaAgregar;

/**
 *
 * @author BRAYAN
 */
public class modelo {
private int numMascotas;
private VistaAgregar v;
VistaAgregar va = new VistaAgregar();

public void setNumMascotas(int numMascotas) {
        this.numMascotas = numMascotas;
    }

    public int getNumMascotas() {
        
        return numMascotas;
    }
public String mascotas[]=new String[numMascotas];

    public String[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(String[] mascotas) {
        this.mascotas = mascotas;
    }
    
    
    
}
