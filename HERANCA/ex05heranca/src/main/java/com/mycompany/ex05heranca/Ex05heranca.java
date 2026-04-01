package com.mycompany.ex05heranca;
public class Ex05heranca {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setNome("Mirella");
        aluno.setIdade(19);
        aluno.setCurso("Eng Comp");
        aluno.falar();
        
        Professor professor = new Professor();
        professor.setNome("Otavio");
        professor.setIdade(54);
        professor.setDisciplina("Math");
        professor.falar();
        
        
        
        
        
    }
}
