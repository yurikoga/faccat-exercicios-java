package apostilaFaccat;

import java.util.Scanner;

public class Exercicio7AlgoritmoDeIdade {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
    /*
    *Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    *escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e
    *mês com 30 dias.
    *
    * */

		//testando

        System.out.println("Programa de Converssão");
        System.out.println("Digite quantos anos, meses e dias você tem");
        System.out.println("Digite quantos anos você tem:");
        int anos = entradaDeDados.nextInt();
        System.out.println("Digite quantos meses você tem:");
        int meses = entradaDeDados.nextInt();
        System.out.println("Digite quantos dias você tem:");
        int dias = entradaDeDados.nextInt();
        int diasTotais = (anos*365)+(meses*30)+dias;
        System.out.println("A sua quantidade de dias totais até o momento é : "+diasTotais);
    }
}