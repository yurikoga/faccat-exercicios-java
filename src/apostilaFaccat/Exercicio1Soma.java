package apostilaFaccat;

import java.util.Scanner;

public class Exercicio1Soma {

//    static = vai ser executado dentro da pasta principal
//    void = não retorna nada

    public static void main(String[] args){

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("SOMA");

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = entradaDados.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = entradaDados.nextInt();

        int soma = primeiroNumero + segundoNumero;

        System.out.printf("A soma é: %d", soma);
    }
}
