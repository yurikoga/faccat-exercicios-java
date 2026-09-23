package apostilaFaccat;

/*18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). */

/*
* a Resolução nº 23.659/2021 do Tribunal Superior Eleitoral (TSE) permite que jovens tirem o título a partir dos 15 anos. Porém, eles só podem votar, de forma facultativa, ao completarem 16 anos até o dia da eleição.
* voto facultativo para pessoas de 16 a 17 anos, maiores de 70 anos
* voto obrigátorio para aqueles que tem ou são maiores de 18 anos*/

import java.util.Scanner;

public class Exercicio18_01PermissaoParaVotar {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short anoDeNascimento,anoAtual;
		byte[] idades = new byte[2];
		idades[1] = 16;
		System.out.println("PROGRAMA - PERMISSÃO PARA VOTO");
		System.out.println("Digite o ano em que vc nasceu:");
		anoDeNascimento = sc.nextShort();
		System.out.println("Digite o ano atual:");
		anoAtual = sc.nextShort();
		//Qualquer operação aritmética entre tipos inteiros (byte, short, char, int) é automaticamente promovida para o tipo int antes de ser executada.
		//narrowing casting int -> byte necessário para que o resultado seja armazenado.
		idades[0] = (byte) (anoAtual-anoDeNascimento);
		if(idades[0] < idades[1]){
			System.out.printf("Com %d anos de idade você não poderá votar este ano.\n",idades[0]);
		}else{
			System.out.printf("Com %d anos de idade você poderá votar este ano.\n",idades[0]);
		}
		sc.close();
	}

}
