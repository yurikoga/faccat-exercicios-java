package apostilaFaccat;

//Soltando a mente

//29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class Exercicio29_2ComparacaoESoma {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short[]valores = new short[3];
		short maior1,maior2=0,soma;
		byte indice = -1;
		for(byte vez=0;vez<valores.length;vez++){
			System.out.printf("Digite o %d° valor:",(vez+1));
			valores[vez]=sc.nextShort();
		}
		maior1=(short)Math.max(valores[0], Math.max(valores[1],valores[2]));
		for(byte vez=0;vez<valores.length;vez++){
			if (maior1 == valores[vez]){
				indice = vez;
			}
		}

		switch (indice){
			case 0:
				if (valores[1]<valores[2]){
					maior2=valores[2];
				}else{
					maior2=valores[1];
				}
				break;
			case 1:
				if (valores[0]<valores[2]){
					maior2=valores[2];
				}else{
					maior2=valores[0];
				}
				break;
			case 2:
				if (valores[0]<valores[1]){
					maior2=valores[1];
				}else{
					maior2=valores[0];
				}
				break;
		}
		soma=(short)(maior1+maior2);
		System.out.printf("A soma do %d + %d é igual a %d",maior1,maior2,soma);
		sc.close();
	}
}
