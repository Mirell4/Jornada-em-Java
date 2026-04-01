package com.mycompany.ex04heranca;
import java.util.Scanner;

public class Novo extends Carro {
    
    private double seguro = 1000;

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
    
    public double impressaoadd(){
        return seguro + super.getPreco();
    }
    
    
}
