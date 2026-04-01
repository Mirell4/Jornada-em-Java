package com.mycompany.ex04heranca;
import java.util.Scanner;
public class Ex04heranca {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira 1 para carro novo e 2 para seminovo");
        int opcao = 0;
        opcao = s.nextInt();
        
        if(opcao ==1){
            Novo novo = new Novo();
            System.out.printf("O valor do carro novo com seguro eh: %.2f", novo.impressaoadd());
        } else if (opcao == 2){
            Seminovo seminovo = new Seminovo();
            System.out.printf("O valor do carro seminovo - IPVA eh: %.2f", seminovo.imprimirdesc());
        } else {
            System.out.println("Numero invalido");
        }
            
    }
}
