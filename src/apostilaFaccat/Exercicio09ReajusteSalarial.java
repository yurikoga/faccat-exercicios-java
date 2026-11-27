package apostilaFaccat;

import java.util.Scanner;

public class Exercicio9ReajusteSalarial{
	static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		/*9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário. */
		System.out.println("Programa Reajuste Salarial");
		System.out.println("Digite o valor bruto do seu salário atual:");
		float valorBrutoDoSalario = entradaDeDados.nextFloat();
		System.out.println("Digite o percentual de reajuste:");
		float percentualDeReajuste = entradaDeDados.nextFloat();
//		System.out.println(valorBrutoDoSalario);
//		System.out.println(percentualDeReajuste);

		float salarioReajustado = valorBrutoDoSalario+(valorBrutoDoSalario*(percentualDeReajuste/100.0f));

		System.out.printf("\nSalário anterior: %.2f\nPercentual de reajuste: %.2f%%\n\nSalário reajustado: %.2f",valorBrutoDoSalario,percentualDeReajuste,salarioReajustado);

		entradaDeDados.close();
	}
}
