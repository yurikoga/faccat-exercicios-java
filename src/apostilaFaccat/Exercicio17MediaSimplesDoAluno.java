package apostilaFaccat;

/*
* 17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.
* */

import java.util.Scanner;

public class Exercicio17MediaSimplesDoAluno {
    static void main() {
        float [] variaveis = new float[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa Calculo de Média Aritmética Simples");
        System.out.println("Digite a nota da primeira Avaliação do aluno:");
        variaveis[0] = sc.nextFloat();
        System.out.println("Digite a nota da segunda Avaliação do aluno:");
        variaveis[1] = sc.nextFloat();

        variaveis[2] = (variaveis[0]+variaveis[1])/2;


        if (variaveis[2] >= 6){
            System.out.println("ALUNO APROVADO!");
        }else{
            System.out.println("ALUNO REPROVADO!");
        }

        System.out.printf("Média final: %.1f\n", variaveis[2]);

        sc.close();
    }
}
