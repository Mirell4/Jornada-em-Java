/*4. Faça um programa que calcule e mostre a área de um triângulo. Area = (base * altura) / 2.*/

package com.mycompany.ex04poo;
import java.util.Scanner;
public class Triangulo {
    
    private double altura;
    private double base;
    private double area;
    private Scanner s;
    
    public Triangulo(){
        altura = 0;
        base = 0;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Insira a altura do triangle");
        altura = s.nextDouble();
        System.out.println("Insira a base do triangle");
        base = s.nextDouble();
    }
    public void calculararea(){
        area = (base*altura)/2;
    }
    
    public void imprimir(){
        System.out.printf("Sua area eh: %.2f", area);
    }
}
