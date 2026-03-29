/*11. Faça um programa que solicite ao usuário um número 
e gere como saída todo os números primos entre 1 e o número informado.*/

package com.mycompany.ex11poo;
import java.util.Scanner;

public class Primos {
    
    private int num;
    private int divisores;
    private Scanner s;
    
    public Primos(){
        num = 0;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Insira um numero");
        num = s.nextInt();
    }
    
    public void verificar(){
        
        for(int i=1;i<=num;i++){ //percorre ate o limite q o usuario digitou
            
            for(int j = 1; j<=i;j++){ // percorre o i ate o limite
                if(i%j==0){ // verifica se é divisivel
                    divisores ++;
                }
                }if (divisores == 2){
                    System.out.printf("%d", i);//so imprime se for primo ou seja tover dois divisores

                }
                
            
    divisores = 0;     // reseta para o prox num
        }
    }
}
