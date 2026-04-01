package com.mycompany.ex06heranca;

public class Contacorrente extends Contabancaria{
    
    private double limite = 500;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
   
    public double sacar(double valormenos){
        if(valormenos<=getSaldo() + limite){
       setSaldo(getSaldo() - valormenos); // set para mudar e passa dentro do set encapsular
       return getSaldo();
       } else {
            System.out.println("transacao nao concluida verifique saldo ou limite");
            return getSaldo();
        }
   }
    
     public double depositar(double valormenos){
       setSaldo(getSaldo() + valormenos);
       return getSaldo();
   }
    
}
