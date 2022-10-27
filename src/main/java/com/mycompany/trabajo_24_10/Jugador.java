/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_24_10;

/**
 *
 * @author Kristina
 */
public class Jugador extends Persona {
     private String posicion;
    private Seleccion equipo;

    public Jugador(String nombre, int fN, String posicion, Seleccion equipo) {
        this.setNombre(nombre);
        this.setFechaNacimiento(fN);
        this.posicion = posicion;
        this.equipo = equipo;
    }
    
     public Jugador(String nombre, String posicion) {
        this.setNombre(nombre);
        this.posicion = posicion;
    }
    
    
 
  
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

    @Override
    public String mostrarInfo() {
        return "El jugadorse llama"+ this.getNombre()+" nacio en "+
                this.getFechaNacimiento()+"juega en la posicion "+
                this.posicion+" y es selecionado de " + this.equipo;
                
    }
    

}
