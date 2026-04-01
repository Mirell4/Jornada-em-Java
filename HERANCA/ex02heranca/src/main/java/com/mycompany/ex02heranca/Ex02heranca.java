package com.mycompany.ex02heranca;
public class Ex02heranca {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setNome("Mirella");
        aluno.setIdade(18);
        aluno.setCurso("Eng. comp");
        aluno.setPeriodo(3);
        aluno.matricular();
        aluno.pagarboleto();
        
        Professor professor = new Professor();
            
          professor.setNome("Regina");
          professor.setIdade(45);
          professor.lancarnota();
        
    }
}
