package com.mycompany.ex3heranca;
import java.util.Scanner;

public class Classeeconomica extends Passagemaerea {
    
    public void imprimireconomica(){
        System.out.printf("Classe economica; Valor: %.2f; S/ poltrona", super.getValor());
    }
}
