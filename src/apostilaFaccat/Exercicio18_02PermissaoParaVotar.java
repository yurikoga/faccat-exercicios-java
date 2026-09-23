package apostilaFaccat;

import java.util.Scanner;

public class Exercicio18_02PermissaoParaVotar {
	static void main() {
		Scanner sc = new Scanner(System.in);

		short anoDeNascimento, anoAtual;
		byte idade, chave;

		System.out.println("PROGRAMA - PERMISSÃO PARA VOTO");
		System.out.println("Digite o ano em que vc nasceu:");
		anoDeNascimento = sc.nextShort();
		System.out.println("Digite o ano atual:");
		anoAtual = sc.nextShort();

		//Qualquer operação aritmética entre tipos inteiros (byte, short, char, int) é automaticamente promovida para o tipo int antes de ser executada.

		//narrowing casting int -> byte necessário para que o resultado seja armazenado.
		idade = (byte) (anoAtual-anoDeNascimento);

		//'chave', que é do tipo byte, precisa forçar com narrowing casting o tipo int, convertido automaticamente para byte;
		chave = (byte)(idade/16);

		switch(chave){
			case 0:
				System.out.printf("Com %d anos de idade você não poderá votar este ano.\n",idade);
				break;
			default:
				System.out.printf("Com %d anos de idade você poderá votar este ano.\n",idade);
				break;
		}
		sc.close();
	}
}
