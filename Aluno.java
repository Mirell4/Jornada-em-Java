
/*2.Crie uma classe chamada Aluno considerando os seguintes atributos: ra, aluno, email, celular.  
Desenvolva um programa para ler as informações de n alunos armazenando em um ArrayList, 
o processo deve ser finalizado assim que for digitado um ra negativo. Exiba os dados de 
todos os alunos, formatando cada objeto separado por linhas.*/

package com.mycompany.avex2;
import java.util.Scanner;
public class Aluno {
    
    private int ra;
    private String aluno;
    private String email;
    private String celular;
    private Scanner s;
    
    public void entrada(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira seu ra\n");
        ra = s.nextInt();
        
        if(ra<0){
            return; // para o codigo
        }
        s.nextLine(); // nao conta espaco
        
        
        System.out.println("Insira seu nome\n");
        aluno = s.nextLine();
        
        System.out.println("Insira seu email\n");
        email = s.nextLine();
        
        System.out.println("Insira seu celular\n");
        celular = s.nextLine();
        
        
    }
    public void imprimir(){ // um em cada linha
        System.out.printf("RA: %d\n", ra);
        System.out.printf("Nome:: %s\n", aluno);
        System.out.printf("Email: %s\n", email);
        System.out.printf("Celular:%s\n", celular);
       
    }
    
    public int getRa(){
        return ra; // depois q o usuario digitar ele vai ver no get e verificar se é maior ou n que zero
    }
    
}
