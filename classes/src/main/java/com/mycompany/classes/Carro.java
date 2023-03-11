/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Júnior
 */
public class Carro {
 
    //atributos
    String nome;
    String marca;
    int ano;
    int vel;
    
    //metodos
    void acelerar(int aceleracao){
        vel += aceleracao;
    }
    
    void freiar(int reduzir){
        vel -=reduzir;
    }
    
    void buzinar(){
        System.out.println("bibibi");
    }
    
}


