
package com.mycompany.ex3heranca;
import java.util.Scanner;

public class Ex3heranca {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("digitar 1 para “Primeira Classe”, 2 para “Classe Econômica” e 3 para “Classe Executiva");
        
        int opcao = 0;
        
        opcao = s.nextInt();
        
        if(opcao ==1){
            Primeiraclasse primeiraclasse = new Primeiraclasse();
            System.out.printf("Tipo: Primeira classe; Valor passagem: %.2f; S/ Poltrona", primeiraclasse.imprimiradd());
        } else if (opcao == 2){
            Classeeconomica classeeconomica = new Classeeconomica();
            classeeconomica.imprimireconomica();
        } else if(opcao == 3){
            Classeexecutiva classeexecutiva = new Classeexecutiva();
            System.out.println("Insira o numero de uma poltrona");
            s.nextLine(); // limpa ENTER pendente
            classeexecutiva.setPoltrona(s.nextLine());
            
            classeexecutiva.retornovalores();
            
        } else {
            System.out.println("Numero invalido");
        }
    }
}
