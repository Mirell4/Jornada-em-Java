/*12. Faça um programa que solicite ao usuário um número de 1 a 10 e 
gere como saída o produto dos números pares compreendidos entre 1 e o número informado.*/

package com.mycompany.ex12poo;
import java.util.Scanner;

public class Pares {
    
    private int num;
    private int pares = 1;
    private Scanner s;
    
    public Pares(){
        num = 0;
    }
    
    public void entrada(){
        
        s = new Scanner(System.in);
        System.out.println("Insira um num");
        num = s.nextInt();
    }
    
    public void numerospares(){
        
        for(int i=1;i<=num;i++){
            if (i % 2 == 0){
                pares *= i;
            }
        }
        
    }
    
    public void impirmir (){
        System.out.printf("o produto de pares entre 1 e %d sao:\n%d ", num,pares);
    }
}
