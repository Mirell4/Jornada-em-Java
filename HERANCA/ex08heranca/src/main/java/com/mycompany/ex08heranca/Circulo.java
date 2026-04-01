package com.mycompany.ex08heranca;
public class Circulo extends Formageometrica{
    
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    @Override
    public void calculararea(){
        
        super.setArea(3.14 * (raio * raio));
        System.out.printf("Sua area eh %.2f", super.getArea());
        
    }
    
    public void calcularperimetro(){
        super.setPerimetro((2 * raio)*3.14);
        System.out.printf("\nseu perimetro eh %.2f", getPerimetro());
        
    }
}
