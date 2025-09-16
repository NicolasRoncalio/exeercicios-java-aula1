package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args){
    
    int batcoraçao, batidasano;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("quantos anos voce viveu: ");
    batidasano = entrada.nextInt();
    
    batcoraçao = 1 * 60 * 60 * 24 * 365 * batidasano;
    
    System.out.println("O seu coraçao ja bateu " + batcoraçao);
    
}
    
}
