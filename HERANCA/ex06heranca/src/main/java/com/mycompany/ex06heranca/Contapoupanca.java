package com.mycompany.ex06heranca;
public class Contapoupanca extends Contacorrente {
    
    private double rendimento = 10;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
     @Override
   
    public double sacar(double valormenos){
       if(valormenos<= getSaldo()){
       setSaldo((getSaldo() - valormenos) + rendimento);
       return getSaldo();
       } else {
           return getSaldo();
        }
   }
       
   public double depositar(double valormenos){
       setSaldo(getSaldo() + valormenos);
       return getSaldo();
   }

    
}
