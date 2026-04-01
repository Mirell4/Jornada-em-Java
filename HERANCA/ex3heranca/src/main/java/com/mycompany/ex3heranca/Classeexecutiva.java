/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3heranca;

public class Classeexecutiva extends Passagemaerea{
    
    private String poltrona;


    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    
     public String getPoltrona() {
        return poltrona;
    }
    
    public void retornovalores(){
        System.out.printf("Tipo: Classe executiva; valor passagem %.2f e poltrona escolhida: %s", super.getValor(), poltrona);
    }
    
    
    
}
