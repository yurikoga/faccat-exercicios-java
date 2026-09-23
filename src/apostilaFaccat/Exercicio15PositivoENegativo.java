package apostilaFaccat;/*Feito pelo Celular
 * 
 * 15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
 */

import java.util.Scanner;

public class Exercicio15PositivoENegativo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Programa Positivo e Negativo");
	System.out.println("Digite um valornpara descobrir se ele é Positivo ou Negativo:");	
	short valorDigitado = sc.nextShort();
		
	if(valorDigitado >= 0){
	   System.out.println("POSITIVO");
	}else{
	   System.out.println("NEGATIVO");
	}	
}
	
}