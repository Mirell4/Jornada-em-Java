package com.mycompany.ex05heranca;
public class Pessoa {
    
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void falar(){
        System.out.printf("\nMeu nome eh %s tenho %d anos", nome, idade);
    }
    
}
