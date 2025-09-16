/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author 122317640
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        float horas, valhora, desconto;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o valor das sua hora trabalhada: ");
        horas = entrada.nextFloat();
        System.out.println("quantas horas voce trabalhou este mes: ");
        valhora = entrada.nextFloat();
        
        desconto = (horas * valhora) * 6 / 100;
        System.out.println("O seu salario com desconto e: R$"+desconto);
        
        
    }
    
}
