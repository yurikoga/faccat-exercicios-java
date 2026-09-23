package apostilaFaccat;

//Maneira sofisticada

//29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class Exercicio29_3ComparacaoESoma {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short[]valores = new short[3];
		short menor, soma;
		for(byte vez=0;vez<valores.length;vez++){
			System.out.printf("Digite o %d° valor:",(vez+1));
			valores[vez]=sc.nextShort();
		}
		menor=(short)Math.min(valores[0], Math.min(valores[1],valores[2]));
		soma=(short)(valores[0]+valores[1]+valores[2]-menor);
		System.out.printf("A soma é igual a %d",soma);
		sc.close();
	}
}
