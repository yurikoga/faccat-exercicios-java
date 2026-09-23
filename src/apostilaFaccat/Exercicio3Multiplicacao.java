package apostilaFaccat;

import java.util.Scanner;
public class Exercicio3Multiplicacao{
    public static void main(String[] args){
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Programa de Multiplicação");
        System.out.println("Digite um valor:");
        int valor1 = entradaDeDados.nextInt();
        System.out.println("Digite um valor:");
        int valor2 = entradaDeDados.nextInt();
        int multiplicacao = valor1 * valor2;
        System.out.println("O resultado da Multiplicação é :" + multiplicacao);
    }
}