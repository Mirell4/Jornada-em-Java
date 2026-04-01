
package com.mycompany.ex05heranca;
public class Professor extends Pessoa {
    
    private String disciplina;

   
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    
    @Override
    
        public void falar(){
            
        System.out.printf("\nMeu nome eh %s tenho %d anos e minha materia eh: %s", getNome(), getIdade(), getDisciplina());
    
    }
}
