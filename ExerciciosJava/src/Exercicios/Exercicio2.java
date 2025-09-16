package Exercicios;

import java.util.Scanner;


public class Exercicio2 {
    
    public static void main(String[] args) {
        
        float num1, num2, num3, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o preimeiro numero: ");
        num1 = entrada.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = entrada.nextFloat();
        
        media = (num1 + num2 + num3) / 3;
        
        System.out.println("A mdeia dos numeros e: "+String.format("%.2f", media));
        
    }
    
}
