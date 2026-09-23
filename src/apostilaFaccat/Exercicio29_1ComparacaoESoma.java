package apostilaFaccat;

//maneira simples - conforme a atividade solicita

//29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class Exercicio29_1ComparacaoESoma {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short[]valores = new short[3];
		short soma;
		for(byte vez=0;vez<valores.length;vez++){
			System.out.printf("Digite o %d° valor:",(vez+1));
			valores[vez]=sc.nextShort();
		}
		if(valores[0]<valores[1]&&valores[0]<valores[2]){
			//se o 1° valor for menor que o 2° e o 3°, então o 2° e o 3° são os maiores
			soma=(short)(valores[1]+valores[2]);
			System.out.printf("A soma de %d + %d = %d",valores[1],valores[2],soma);
		//se o 1° valor não é o menor, então vamos testar qual do 2° e do 3° são maiores?
		}else if(valores[1]<valores[2]){
			//2° valor menor que o 3°? Sim, então o 1° e o 3° são maiore
			soma=(short)(valores[0]+valores[2]);
			System.out.printf("A soma de %d + %d = %d",valores[0],valores[2],soma);
		}else{
		//2° valor menor que o 3°? Não, então o 1° e o 2° são maiores
			soma=(short)(valores[0]+valores[1]);
			System.out.printf("A soma de %d + %d = %d",valores[0],valores[1],soma);
		}
		sc.close();
	}
}
