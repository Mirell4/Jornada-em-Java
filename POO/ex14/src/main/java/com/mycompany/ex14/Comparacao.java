/*14. Faça um programa que solicite ao usuário 5 números e apresente como saída: o maior e o menor*/

package com.mycompany.ex14;
import java.util.Scanner;
public class Comparacao {
    
    private int[] numeros;
    private int maior;
    private int menor;
    private Scanner s;
    
    public Comparacao(){
        numeros = new int[5];
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        
            for(int i=0;i<5;i++){
                
                System.out.println("Insira um numero");
                numeros[i] = s.nextInt();
                
                if(numeros[i] >= maior){
                    maior = numeros[i];
                    
                } if (numeros[i] <=menor ) {
                    menor = numeros[i];
                }
                
            }
        
    }
    public void imprimir(){
        System.out.printf("O maior numero eh %d e o menor eh %d", maior,menor);
    }
    
}
