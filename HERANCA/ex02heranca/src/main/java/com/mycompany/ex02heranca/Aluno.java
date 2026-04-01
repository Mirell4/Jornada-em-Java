package com.mycompany.ex02heranca;
import java.util.Scanner;
public class Aluno extends Pessoa{
    
    private String curso;
    private int periodo;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public void matricular(){
        System.out.println("Matriculado com sucesso!");
    }
    public void pagarboleto(){
        System.out.println("Boleto pago!");
    }
    
}

