package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args){
        
        float valorAluminio = 0.01f;
        float  raio, altura, custo, pi, area;
        
        Scanner entrada = new Scanner(System.in);
                
        pi = 3.14f;
        
        System.out.println("Digite o raio da lata: ");
        raio = entrada.nextFloat();
        
        System.out.println("Digite a altura da lata: ");
        altura = entrada.nextFloat();
        
        area = 2*pi*raio*(raio + altura);
        custo = area * valorAluminio;
        
        System.out.println("O custo por lata produzida sera de: R$"+ custo);
        
    }
    
}
