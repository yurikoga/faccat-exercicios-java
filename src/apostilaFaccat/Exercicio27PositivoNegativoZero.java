package apostilaFaccat;

//27) Ler um valor e escrever se é positivo, negativo ou zero.

import java.util.Scanner;

public class Exercicio27PositivoNegativoZero {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short numeroDigitado;
		System.out.println("Digite um valor:");
		numeroDigitado = sc.nextShort();
		if (numeroDigitado == 0){
			System.out.println("ZERO");
		}else if (numeroDigitado > 0){
			System.out.println("POSITIVO");
		}else{
			System.out.println("NEGATIVO");
		}
		sc.close();
	}
}
