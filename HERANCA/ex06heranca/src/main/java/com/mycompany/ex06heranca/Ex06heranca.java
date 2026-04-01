package com.mycompany.ex06heranca;

public class Ex06heranca {

    public static void main(String[] args) {

        Contabancaria contabancaria = new Contabancaria();

        contabancaria.setTitular("Julia");
        contabancaria.setNumero(478);
        contabancaria.setSaldo(1);

        System.out.printf("Saldo inicial: %.2f\n", contabancaria.getSaldo());
        System.out.printf("Saldo apos saque: %.2f\n", contabancaria.sacar(1));
        System.out.printf("Saldo apos deposito: %.2f\n\n", contabancaria.depositar(1));



        Contacorrente contacorrente = new Contacorrente();

        contacorrente.setTitular("Mirella"); // caracteristica fixa
        contacorrente.setNumero(1232);
        contacorrente.setSaldo(10000);

        System.out.printf("Saldo inicial: %.2f\n", contacorrente.getSaldo());
        System.out.printf("Saldo apos saque: %.2f\n", contacorrente.sacar(109800)); // valor por parametro
        System.out.printf("Saldo apos deposito: %.2f\n\n", contacorrente.depositar(350));



        Contapoupanca contapoupanca = new Contapoupanca();

        contapoupanca.setTitular("Maria");
        contapoupanca.setNumero(5454);
        contapoupanca.setSaldo(100);

        System.out.printf("Saldo inicial: %.2f\n", contapoupanca.getSaldo());
        System.out.printf("Saldo apos saque: %.2f\n", contapoupanca.sacar(150));
        System.out.printf("Saldo apos deposito com rendimento: %.2f\n", contapoupanca.depositar(1));
    }
}