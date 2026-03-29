
/*9. Escreva um programa que leia 2 notas de um aluno, ele deverá calcular a 
média ponderada utilizando a seguinte fórmula: Media = (N1*2 + N2*3)/5. A partir da média, 
informar sua situação de acordo com o seguinte critério: 
Se média >= 5 – Aluno aprovado 
Se média < 5 - Aluno reprovado 
*/

package com.mycompany.ex09poo;
import java.util.Scanner;

public class Media {
    
    private double n1;
    private double n2;
    private double media = 0;
    private Scanner s;
    
    public Media(){
        n1 = 0;
        n2= 0;
    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Insira sua n1");
        n1 = s.nextDouble();
        System.out.println("Insira sua n2");
        n2 = s.nextDouble();
    }
    
    public void calculomedia(){
        media = (n1*2 + n2*3)/5;
            if(media>=5){
                System.out.printf("Sua media eh %.2f e voce esta Aprovado", media);
            }else{
                System.out.printf("Sua media eh %.2f e voce esta Reprovado", media);
            }
    
    }
}
