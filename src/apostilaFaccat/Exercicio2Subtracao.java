package apostilaFaccat;

import java.util.Scanner;

public class Exercicio2Subtracao {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Programa de Subtração");
        System.out.println("Digite um valor");
        int primeiroNumero = entradaDeDados.nextInt();

        System.out.println("Digite outro valor");
        int segundoNumero = entradaDeDados.nextInt();

        int subtracao = primeiroNumero - segundoNumero;

        System.out.println("O valor da subtração dos números digitados é :" + subtracao);
    }
}
