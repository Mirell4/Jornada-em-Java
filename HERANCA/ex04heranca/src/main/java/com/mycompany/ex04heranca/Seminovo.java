package com.mycompany.ex04heranca;
import java.util.Scanner;

public class Seminovo extends Carro {
    
    private double desconto = 1000;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double imprimirdesc(){
        return super.getPreco() - desconto;
        
    }
}
