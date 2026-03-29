/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex01poo;
import java.util.Scanner;
///*1. Faça um programa que receba o salário de um funcionário (número real),
///calcule e mostre o novo salário, adicionando um aumento de 25%.*/
public class Salario {
    
    private double salario;
    private double aumento = 1.25;
    private double novosal;
    private Scanner s;

    public Salario(){
        salario = 0;
        novosal = 0;
    }

    public void entrada(){

            s = new Scanner(System.in);
            System.out.println("Insira seu salario");
            salario = s.nextDouble();
    }
    public void calculoaumento(){
        novosal = (salario*aumento);
    }
    public void imprimir (){
        System.out.printf("Seu novo salario eh: %.2f", novosal);
    }
}