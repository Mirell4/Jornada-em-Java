/*8. Faça um programa que receba como entrada um valor inteiro e apresente como resultado o seu fatorial.*/

package com.mycompany.ex08poo;
import java.util.Scanner;

public class Fatorial {
    
    private int num;
    private int fatorial;
    private Scanner s;
    
    public Fatorial(){
        num = 0;
        fatorial = 1;
    }
    
    public void entrada(){
        
        s = new Scanner(System.in);
        
        System.out.println("Insira um numero");
        num = s.nextInt();
        
    }
    
    public void calculofatorial(){
        
        for(int i=1;i<=num;i++){
            
            fatorial *= i;
        }
    }
    public void imprimir(){
       
           System.out.printf("o fatorial de %d eh %d", num,fatorial);
    }
}
