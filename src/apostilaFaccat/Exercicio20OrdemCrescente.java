package apostilaFaccat;

//20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

//qual a diferença de java.lang.Math para static java.lang.Math.max.
//para mim a diferença é que enquanto no primeiro caso eu estou importando a biblioteca completa e tudo o existe nela e no segundo caso eu estou especificando o único methods que eu quero dos que existem em toda a classe.

public class Exercicio20OrdemCrescente {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short primeiroValor, segundoValor, maior, menor;
		System.out.println("PROGRAMA - VALORES EM ORDEM CRESCENTE");
		System.out.println("Digite o primeiro valor:");
		primeiroValor = sc.nextShort();
		System.out.println("digite o segundo valor:");
		segundoValor = sc.nextShort();
		maior = (short)(Math.max(primeiroValor,segundoValor));
		menor = (short)(Math.min(primeiroValor,segundoValor));
		System.out.printf("%d,%d;",maior,menor);


	}
//	static void main() {
//		Scanner sc = new Scanner(System.in);
//		short primeiroValor, segundoValor;
//		System.out.println("PROGRAMA - VALORES EM ORDEM CRESCENTE");
//		System.out.println("Digite o primeiro valor:");
//		primeiroValor = sc.nextShort();
//		System.out.println("digite o segundo valor:");
//		segundoValor = sc.nextShort();
//		if(primeiroValor > segundoValor){
//			System.out.printf("%d,%d",primeiroValor,segundoValor);
//		}else{
//			System.out.printf("%d,%d",segundoValor,primeiroValor);
//		}
//	}
}
