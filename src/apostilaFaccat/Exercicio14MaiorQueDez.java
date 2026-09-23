package apostilaFaccat;/* Feito pelo Celular
 * 
 * 14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!*/

import java.util.Scanner;

public class Exercicio14MaiorQueDez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa - Maior que 10");
		System.out.println("Digite um valor e o programa dirá se ele é maior ou não que 10.");
		byte valorInserido = sc.nextByte();
		while(valorInserido == 10){
			System.out.println("SÉRIO QUE VC DIGITOU 10?\nDIGITE DE NOVO");
			valorInserido = sc.nextByte();
		};
		if(valorInserido > 10){
			System.out.println("É MAIOR QUE 10!");
		}else if(valorInserido < 10){
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		sc.close();
		
		
}
}