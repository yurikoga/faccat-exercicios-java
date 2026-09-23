package apostilaFaccat;/* Feito pelo celular
 * 
 * 16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o custo total da compra*/

import java.util.Scanner;

public class Exercicio16Macas {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
    
        System.out.println("PROGRAMA PRECIFICAÇÃO DE MAÇAS");
        System.out.println("Digite a quantidade de maças que vc pegou:");
        byte quantidadeDeFrutas = sc.nextByte();
    
        if(quantidadeDeFrutas < 12){
            float preco01 = 1.30f;
            float custoTotal01 = quantidadeDeFrutas*preco01;
            System.out.printf("Custo Total da compra: %.2f",custoTotal01);
        }else{
            float preco02 = 1f;
            float custoTotal02 = quantidadeDeFrutas*preco02;
            System.out.printf("Custo Total da compra: %.2f",custoTotal02);
        }
    sc.close();
}
}