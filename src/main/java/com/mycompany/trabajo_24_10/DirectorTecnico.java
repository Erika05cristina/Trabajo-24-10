/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_24_10;

/**
 *
 * @author Kristina
 */
public class DirectorTecnico {
    String nombre;
    int fechaNacimiento;
    int yearInicioContrato;
    int yearFinContrato;
    Seleccion equipo;

    public String mostrarInfo(){
        return this.nombre + " es el director tecnico de la " 
                + this.equipo.nombre + "\nsu contrato inicio en el " 
                + this.yearInicioContrato + " y finaliza en el " + this.yearFinContrato;
    }
}
