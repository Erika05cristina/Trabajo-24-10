/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabajo_24_10;

/**
 *
 * @author Kristina
 */
public class Trabajo_24_10 {

    public static void main(String[] args) {

        var eduardo = new DirectorTecnico("Eduardo Jose", 1962,
                "Ecuatoriano", 13);
        var alfaro = new DirectorTecnico("Gustavo Alfaro", 1892,
                "Chileno", 15);

        var ecuador = new Seleccion("ECU", "Federación Ecuatoriana de Fútbol (FEF)",
                4, alfaro);

        var chile = new Seleccion("CHI", "Federación Chilena de Fútbol (FCF)",
                8, eduardo);

        
        var enner = new Jugador("Enner Valencia", 1977, "Goleador",
                ecuador);
        var byron = new Jugador("Byron Castillo", 1998, "Defensa",
                ecuador);
        var reyArturo = new Jugador("Arturo Vidal", "Mediocampo");

        
        System.out.println(ecuador.obtienePais() + " Datos del D.T: "
                + ecuador.getSeleccionador().getNombre());
        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfo());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(alfaro.mostrarInfo());
        System.out.println(alfaro.mostrarInfo());
    }
}
