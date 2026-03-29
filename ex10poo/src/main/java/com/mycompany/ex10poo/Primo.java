/*10. Faça um programa que receba um valor inteiro e informe se ele é um número primo.*/
package com.mycompany.ex10poo;
import java.util.Scanner;

public class Primo {
    
    private int num;
    int divisores = 0;
    private Scanner s;
    
    public Primo(){
        num = 0;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Insira um num");
        num = s.nextInt();
    }
    
    public void verificar(){
        // primos so podem ser divididos por eles mesmo ou 1 para dar zero
        for(int i=1;i<=num;i++){ // vai de 1 ate o numero
            
            if(num % i == 0){ // verifica se o resto e zero
                divisores ++; // se for soma 1 nos divisores 
            }
            
        }
        
    }
    public void resultado(){
        
        if (divisores == 2){ // se o resto for zero p dois numeros e primo se for mais q isso n e
            System.out.printf("%d eh primo", num);
        } else {
            System.out.printf("%d nao eh primo", num);
        }
    }
    
}
