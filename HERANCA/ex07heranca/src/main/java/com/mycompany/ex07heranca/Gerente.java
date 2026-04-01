package com.mycompany.ex07heranca;

public class Gerente extends Funcionario{
    
    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
     public String getDepartamento() {
        return departamento;
    }

    @Override
    
    public void calcular_salario(){
        System.out.printf("\nseu salario eh: %.2f + 10 por cento = %.2f", super.getSalario(),(super.getSalario() * 1.10));
    }
    
}
