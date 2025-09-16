
package Exercicios;

import java.util.Scanner;



public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int num1, num2, soma;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro: ");
        
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        num2 = entrada.nextInt();
        soma = num1 + num2;
                
        System.out.println("A soma: "+soma);
    }
    
}
