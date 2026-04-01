package com.mycompany.ex01heranca;
import java.util.Scanner;

public class Transporte {
    
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void movimento(String instrucao){
        System.out.printf("Transporte %s...", instrucao);
    }
    public void ligarmotor(){
        System.out.println("motor ligado");
    }
}

