package pct;

import java.util.Scanner;


public class Conversor {

    public static void main(String[] args) {
        //Variáveis
        double total , n1;
        
        //Instancia e objetos de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t ╠══=====Conversor de Temperatura=====══╣ \n\t\t\t");
        
        //Medida
        System.out.println("Converta C° para F°");
        
        //Entrada
        System.out.println("\nDigite o valor em C°");
        n1 = entrada.nextDouble();
        
        //Processamento
        double resultado = n1 * 9 / 5 + 32;
        
        //fórmula
        System.out.println("\n\nFórmula: F° = C° * 9 / 5 + 32");
        
        //Saída
        System.out.println("\nO resultado é: "+resultado+"ºF");

    }
    
}
