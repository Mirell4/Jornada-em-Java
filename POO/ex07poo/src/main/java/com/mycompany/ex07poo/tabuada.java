/*7. Construa um programa que exiba a tabuada de 1 até N, 
onde N é o número informado pelo usuário.*/
package com.mycompany.ex07poo;
import java.util.Scanner;

public class Tabuada {
    
    private int num;
    int i,j;
    private Scanner s;
    
    public Tabuada(){
        
        num = 0;
    }
    
    public void calculareexibir(){
        s = new Scanner(System.in);
        
        System.out.println("Insira um num");
        num = s.nextInt();
        
            for(i=1;i<=num;i++){ // define ate qual tabuada vai
                for(j=1;j<=10;j++){
                    System.out.printf("%d x %d = %d\n", i,j,(i*j)); // multiplicador de 1 a 10
            }
        
        }
    
    }
    
}
