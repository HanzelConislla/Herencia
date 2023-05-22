/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Estudiante
 */
public class Arquero extends Personaje {
    
    private int agilidad;
    private int presicion;
    
    public void dispararFlecha(Personaje atacado){
           
    }
    
    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        if(this.presicion>5)
           atacado.setVida(nivelActualDeVida - 50);
        else
            atacado.setVida(nivelActualDeVida - 6);
        atacado.defender(this);
    }

    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * @return the presicion
     */
    public int getPresicion() {
        return presicion;
    }

    /**
     * @param presicion the presicion to set
     */
    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }
     
}
