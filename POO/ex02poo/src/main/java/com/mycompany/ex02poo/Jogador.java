/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*2. Faça um programa que receba a idade de um jogador classificando-o em uma das seguintes categorias: 
infantil A = 5 - 7 anos // infantil B = 8-10 anos 
juvenil A = 11-13 anos // juvenil B = 14-17 anos 
adulto = maiores de 18 anos*/
package com.mycompany.ex02poo;
import java.util.Scanner;

public class Jogador {
    
    private int idade;
    private String classif;
    private Scanner s;
 
    public Jogador(){
        idade = 0;
        classif = "";

    }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Insira sua idade");
        idade = s.nextInt();
    }
    
    public void classificar(){
        
            if(idade <=5 && idade <=7){
                classif = "InfantilA";
            }
            else if(idade <=8 && idade <=10){
            classif = "InfantilB";
            }
            else if(idade <=11 && idade<=13){
            classif = "JuvenilA";
            }
            else if(idade <=14 && idade <=17){
                classif = "JuvenilB";
            }
            else{
                classif = "Adulto";
            }
        
    }
        public void imprimir(){
            System.out.printf("Sua idade eh %d, entao sua classificacao eh %s", idade, classif);
        }
}