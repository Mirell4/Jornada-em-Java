/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3heranca;
import java.util.Scanner;
public class Passagemaerea {
    
    private double valor = 500;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprimirpassagem(){
        System.out.printf("%d", valor);
    }    
}
