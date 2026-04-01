package com.mycompany.ex06heranca;
import java.util.Scanner;

public class Contabancaria {
    
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
   public double sacar(double valormenos){
       if(valormenos<= saldo){
       saldo = saldo - valormenos;
       return saldo;
       } else {
           return saldo;
        }
   }
       
   public double depositar(double valormenos){
       saldo = saldo + valormenos;
       return saldo;
   }

}
