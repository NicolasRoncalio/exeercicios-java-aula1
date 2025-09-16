package Exercicios;

import java.util.Scanner;


public class Exercicio3 {
    
    public static void main(String[] args) {
        
        double dolar, valProduto, conver;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o valor do dolar para real ataulmente: ");
        dolar = entrada.nextDouble();
        System.out.println("Qual o valor do produto em dolar para a conversão: ");
        valProduto = entrada.nextDouble();
        
        conver = dolar * valProduto;
        
        System.out.println("A conversão do valor do produto e: R$"+String.format("%.2f", conver));
        
    }
    
}
