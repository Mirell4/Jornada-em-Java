/*5. Faça um programa que solicite ao usuário 
a entrada de 10 números inteiros e imprima como resultado a soma 
de todos os ímpares.*/

package com.mycompany.ex05poo;
import java.util.Scanner;

public class Soma {
    
    private int num;
    private int somador;
    private Scanner s;
    private int i;
    
    public Soma(){
        somador = 0;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
         for(i=0; i<10;i++){
             System.out.println("Insira um numero");
             num = s.nextInt();
             if(num % 2 != 0){
                 somador = somador + num;
             }
           
         }
              
    }
    public void imprimir(){
        System.out.printf("a soma dos numeros impares eh: %d", somador);
        
    }
    
}
