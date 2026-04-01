package com.mycompany.ex08heranca;

public class Formageometrica {
    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public void calculararea(){
        System.out.printf("Sua area eh: %.2f", area);
    }
    
    public void perimetro(){
        System.out.printf("Seu perimetro eh: %.2f", perimetro);
    }
    
}
