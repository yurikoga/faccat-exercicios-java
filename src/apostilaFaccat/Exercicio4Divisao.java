package apostilaFaccat;

import java.util.Scanner;

public class Exercicio4Divisao {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Programa Divisão");
        System.out.println("Digite um valor:");
        float valor01 = entradaDeDados.nextFloat();
        System.out.println("Digite um valor:");
        float valor02 = entradaDeDados.nextFloat();
        float divisao = valor01/valor02;
        System.out.printf("A Divisão dos números digitados é : %.2f \n",divisao);

    }
}
