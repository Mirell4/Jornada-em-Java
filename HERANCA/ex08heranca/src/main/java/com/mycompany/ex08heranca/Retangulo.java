package com.mycompany.ex08heranca;

public class Retangulo extends Formageometrica {
    
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public void calculararea(){
        super.setArea(base * altura);
        System.out.printf("Sua area eh: %.2f",super.getArea());
        
    }
    
    public void calcularperimetro(){
        super.setPerimetro((base + altura)*2);
        System.out.printf("\nSeu perimetro eh: %.2f",super.getPerimetro());
    }
    
}
