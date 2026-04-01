
package com.mycompany.ex01heranca;

public class Ex01heranca {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        carro.setMarca("Volksvagem");
        carro.setModelo("Gol");
        carro.movimento("Para frente");
        carro.ligarmotor();
        carro.abrirportamalas();
        carro.ligarradio();
        
        Moto moto = new Moto();
        
        moto.setMarca("Volksvagem");
        moto.setModelo("Gol");
        moto.movimento("Dar ré");
        moto.ligarmotor();
        moto.baixardescanso();
        
        
    }
}
