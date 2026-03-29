/*6. Faça um programa que solicite ao usuário a entrada de 
10 números inteiros e imprima como resultado a soma de todos os pares.*/

package com.mycompany.ex06poo;
import java.util.Scanner;

public class Somapares {
    
    private int num;
    private int somador;
    int i;
    private Scanner s;
    
    public Somapares(){
        
        somador = 0;
        
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        for(i=0;i<10;i++){
            
            System.out.println("Insira um numero");
            num = s.nextInt();
            
            if(num %2 == 0){
                somador = (somador + num);
            }
        
        }
        
    }
    public void imprimir(){
        System.out.printf("a soma dos pares digitados eh %d", somador);
    }
}
