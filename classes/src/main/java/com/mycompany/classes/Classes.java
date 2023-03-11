/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classes;

/**
 *
 * @author Júnior
 */
public class Classes {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;
        
        c1.acelerar(10);
        System.out.println("Velocidade " + c1.vel+ "KM/Horas");
        c1.freiar(50);
         System.out.println("Velocidade " + c1.vel+ "KM/Horas");
         c1.buzinar();
        
              
    }
}
