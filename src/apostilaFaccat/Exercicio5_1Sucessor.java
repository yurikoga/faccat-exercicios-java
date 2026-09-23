package apostilaFaccat;

import java.util.Scanner;

public class Exercicio5_1Sucessor {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Programa Sucessor");
        System.out.println("Digite o valor:");
        int valor = entradaDeDados.nextInt();
        int sucessor = valor + 1;
        System.out.println("O número antecessor do número digitado é : "+sucessor);


    }
}
