package apostilaFaccat;

import java.util.Scanner;

public class Exercicio35PostoDeCombustivel {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char codCombustivel;
		float litrosVendidos, precoGasolina = 3.30f, precoAlcool = 2.90f, precoTotal, precoPago;


		System.out.println("Digite o Código do Combustível:\t(A = Álcool, G = Gasolina)");
		//next() - captura o que o usuario digitou até o 'ENTER' ser apertador ou confirmado
		//toUpperCase() - torna o caracter digitado maiúsculo
		//charAt(0) - pega o primeiro caracter
		codCombustivel = sc.next().toUpperCase().charAt(0);
		System.out.println("Digite o número de Litros Vendidos:");
		litrosVendidos = sc.nextFloat();

		switch (codCombustivel) {
			case 'A':
				if (litrosVendidos < 21) {
					precoTotal = precoAlcool * litrosVendidos;
					precoPago = precoTotal - precoTotal * 3 / 100;
					System.out.printf("Valor á pagar: %.2f", precoPago);
				} else {
					precoTotal = precoAlcool * litrosVendidos;
					precoPago = precoTotal - precoTotal * 5 / 100;
					System.out.printf("Valor á pagar: %.2f", precoPago);
				}
				break;
			case 'G':
				if (litrosVendidos < 21) {
				precoTotal = precoAlcool * litrosVendidos;
				precoPago = precoTotal - precoTotal * 4 / 100;
				System.out.printf("Valor á pagar: %.2f", precoPago);
				} else {
				precoTotal = precoAlcool * litrosVendidos;
				precoPago = precoTotal - precoTotal * 6 / 100;
				System.out.printf("Valor á pagar: %.2f", precoPago);
				}
				break;
		}


	}
}
