package apostilaFaccat;

/*
* 19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class Exercicio19MaiorQue {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short primeiroValor,segundoValor;
		System.out.println("Programa Maior que o Outro");
		System.out.println("Digite o primeiro valor:");
		primeiroValor = sc.nextShort();
		System.out.println("Digite o segundo valor:");
		segundoValor = sc.nextShort();
		if(primeiroValor > segundoValor){
			System.out.printf("%d é maior que %d",primeiroValor,segundoValor);
		}else {
			System.out.printf("%d é maior que %d",segundoValor,primeiroValor);
		}
		sc.close();
	}
}