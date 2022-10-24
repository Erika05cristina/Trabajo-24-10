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
        
        var ecuador = new Seleccion();
        ecuador.codigoFIFA="ECU";
        ecuador.nombre="Federación Ecuatoriana de Fútbol (FEF)";
        ecuador.participacionesMundial=4;
        System.out.println(ecuador.obtienePais());

        var chile = new Seleccion();
        chile.codigoFIFA="CHI";
        chile.nombre="Federación Chilena de Fútbol (FCF)";
        chile.participacionesMundial=9;
        System.out.println(chile.obtienePais());


        var enner = new Jugador();
        enner.nombre="Enner Valencia";
        enner.posicion="Goleador";
        enner.fechaNacimiento=1989;
        enner.equipo=ecuador;

        var byron = new Jugador();
        byron.nombre="Byron Castillo";
        byron.posicion="Defensa";
        byron.fechaNacimiento=1998;
        byron.equipo=ecuador;

        var reyArturo = new Jugador();
        reyArturo.nombre="Arturo Vidal";
        reyArturo.posicion="Mediocampo";
        reyArturo.fechaNacimiento=1987;
        reyArturo.equipo=chile;
        
        var gustavo = new DirectorTecnico();
        gustavo.nombre="Gustavo Alfaro";
        gustavo.fechaNacimiento=1962;
        gustavo.yearInicioContrato=2020;
        gustavo.yearFinContrato=2022;
        gustavo.equipo=ecuador;
        
        var eduardo = new DirectorTecnico();
        eduardo.nombre="Eduardo Berizzo";
        eduardo.fechaNacimiento=1969;
        eduardo.yearInicioContrato=2022;
        eduardo.yearFinContrato=2026;
        eduardo.equipo=chile;


        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfo());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(gustavo.mostrarInfo());
        System.out.println(eduardo.mostrarInfo());
        
        
        
    }
}
