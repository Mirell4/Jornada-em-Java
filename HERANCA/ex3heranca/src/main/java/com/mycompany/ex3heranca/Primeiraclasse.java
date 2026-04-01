package com.mycompany.ex3heranca;

import java.util.Scanner;
public class Primeiraclasse extends Passagemaerea{
    
    private double valoradd = 250;

    
    public double imprimiradd(){
        
        return valoradd + super.getValor();
        
    }
}
