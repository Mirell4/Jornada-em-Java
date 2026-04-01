package com.mycompany.ex07heranca;

public class Ex07heranca {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Arielle");
        funcionario.setIdade(55);
        funcionario.setSalario(1000);
        funcionario.calcular_salario();
        
        Gerente gerente = new Gerente();
        gerente.setNome("Mirella");
        gerente.setIdade(19);
        gerente.setDepartamento("Gerencia");
        gerente.setSalario(1500);
        gerente.calcular_salario();
        
        Programador programador = new Programador();
        programador.setNome("Mirellao");
        programador.setIdade(23);
        programador.setDepartamento("Programar");
        programador.setSalario(22000);
        programador.calcular_salario();
    }
}
