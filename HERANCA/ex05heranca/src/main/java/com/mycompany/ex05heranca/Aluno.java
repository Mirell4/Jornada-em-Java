
package com.mycompany.ex05heranca;

public class Aluno extends Pessoa {
    
    public String curso;

    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    
    @Override //serve para avisar ao Java que você está sobrescrevendo um método da classe mãe
    public void falar(){
        
        System.out.printf("\nMeu nome eh %s tenho %d anos e estou cursando: %s", getNome(), getIdade(), getCurso());
        
    }
    
}
