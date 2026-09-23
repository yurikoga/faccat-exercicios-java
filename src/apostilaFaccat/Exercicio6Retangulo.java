package apostilaFaccat;

import java.util.Scanner;

public class Exercicio6Retangulo {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Programa Cálculo do Retângulo");
        System.out.println("Digite o valor da base do Retângulo:");
        float base = entradaDeDados.nextFloat();
        System.out.println("Digite o valor da altura do Retângulo:");
        float altura = entradaDeDados.nextFloat();
        float area = base * altura;
        System.out.printf("A área do Retângulo é : %.2f \n"+area);
    }
}
