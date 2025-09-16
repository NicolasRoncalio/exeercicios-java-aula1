
package Exercicios;

import java.util.Scanner;


public class Exercicio5 {
   
     public static void main(String[] args){
         
         float salario, porcentreajuste, reajuste, novosalario;
         
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Seu salario atual: ");
         salario = entrada.nextFloat();
         System.out.println("Percentual do reajuste: ");
         porcentreajuste = entrada.nextFloat();
         
         reajuste = salario * porcentreajuste / 100;
         novosalario = salario + reajuste;
         
         System.out.println("o seu novo salario sera: R$"+novosalario);
         
         
         
         
         
     }
    
}
