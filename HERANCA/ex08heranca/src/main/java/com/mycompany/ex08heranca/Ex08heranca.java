package com.mycompany.ex08heranca;

public class Ex08heranca {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(10);
        retangulo.setBase(10);
        retangulo.calculararea();
        retangulo.calcularperimetro();
        
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        circulo.calculararea();
        circulo.calcularperimetro();
    }
}
