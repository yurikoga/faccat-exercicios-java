package apostilaFaccat;

//28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio28ComparacaoDeValores {
	static void main() {
		Scanner sc = new Scanner(System.in);

		short[]valores = new short[3];
		short valor;

		for(byte vez = 0; vez < valores.length; vez++){
			System.out.printf("Digite o %d° valor:",(vez+1));
			valores[vez]=sc.nextShort();
		}

		if (valores [0] > valores[1] && valores[0] > valores[2] ){
			valor = valores[0];
		}else if(valores [1] > valores[0] && valores[1] > valores[2]){
			valor = valores[1];
		}else {
			valor = valores[2];
		}
		System.out.printf("O maior valor digitado é: %d", valor);
		sc.close();
	}
}
