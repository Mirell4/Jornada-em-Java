/*3. Faça um programa que receba a altura e o sexo de
uma pessoa (M - masculino e F feminino) e calcule seu peso ideal, 
utilizando as seguintes fórmulas: 
homens: (72.7*h)-58 
mulheres: (62.1*h)-44.7 
*/
package com.mycompany.ex03poo;
import java.util.Scanner;

public class Pessoa {
    private double altura;
    private char sexo;
    private double homem = 0;
    private double mulher = 0;
    private Scanner s;
    
    public Pessoa(){
        altura = 0;
        sexo = ' ';
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("insira sua altura");
        altura = s.nextDouble();
        System.out.println("insira seu sexo F = feminino || M = masuclino)");
        sexo = s.next().charAt(0); // especifico para char "0" pq pega a primeira posição       
    }
    
    public void calculopesoideal(){
        homem = (72.7*altura)-58;
        mulher = (62.1*altura)-44.7;
        
        if(sexo == 'F' || sexo == 'f'){
            System.out.printf("seu peso ideal eh %.2f", mulher);
        }else if(sexo == 'M' || sexo == 'm'){
            System.out.printf("seu peso ideal eh %.2f", homem);
        }else{
            System.out.println("Caractere invalido");
        }
    }
    
}
