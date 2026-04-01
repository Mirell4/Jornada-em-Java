/* 13. Faça um programa que solicite ao usuário um número e apresente 
como resultado a média de todos os números pares e ímpares. */
package com.mycompany.ex13poo;
import java.util.Scanner;

public class Media {
    
    private int num;
    private int somapar=0;
    private int somaimpar=0;
    private double mediapar;
    private double mediaimpar;
    private int contpar = 0;
    private int contimpar = 0;
    private Scanner s;
    
    public Media(){
        num = 0;
        mediapar = 0;
        mediaimpar = 0;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Insira um numero");
        num = s.nextInt();
    }
    
    public void calculomedias(){
        
        for(int i=1;i<=num;i++){

                if(i%2==0){
                    somapar += i;
                    contpar++;
                } else {
                    somaimpar += i;
                    contimpar++;
                }
            
        }
        
    }
    
    public void imprimir(){
        mediapar = somapar/contpar;
        mediaimpar = somaimpar/contimpar;
        System.out.printf("A media dos numeros pares eh %.2f", mediapar);
        System.out.printf("\nA media dos numeros impares eh %.2f", mediaimpar);
    }
    
    
}
