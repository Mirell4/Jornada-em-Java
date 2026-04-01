package com.mycompany.avex2;
import java.util.Scanner;
import java.util.ArrayList;

public class Avex2 {

    public static void main(String[] args) {
        
        
        ArrayList<Aluno> aluno = new ArrayList();
        
        int i = 0;
        
        while(true){
            Aluno a = new Aluno();
            a.entrada();
            
            if(a.getRa()< 0){
                break;
            }
            aluno.add(a);
            
        }
        System.out.println("Alunos:");
        for (int j=0; j < aluno.size(); j++) {
            
            aluno.get(j).imprimir();
            
        }
        
    }
}
