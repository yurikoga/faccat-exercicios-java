package apostilaFaccat;

//31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.

import java.util.Scanner;

public class Exercicio31FormacaoDeTriangulo {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		short[] lado=new short[4];
		System.out.println("---PROGRAMA FORMAÇÃO DE UM TRIÂNGULO---");

		while (true){
			for (byte vez=0;vez<(lado.length-1);vez++){
				System.out.printf("Digite o %d° lado:",(vez+1));
				lado[vez]=sc.nextShort();
			}
			lado[3]=(short)(lado[0]+lado[1]);
			if (lado[3] != lado[2]){
				System.out.println("É um triângulo!");
				break;
			}else{
				System.out.println("Tente de novo!");
			}
		}

	}
}
