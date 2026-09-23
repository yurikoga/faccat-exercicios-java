package apostilaFaccat;
/*10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.*/

//tipoDeDado valorParaConsumidor = SomaDoCustoFabrica+(SomaDoCustoFabrica*(porcentagemDistribuidor/100))+(somaDoCustoFabrica*(porcentagemImpostos/100))
//float valorParaConsumidor = custoFabrica+(custoFabrica*(28/100))+(custoFabrica*(45/100))

import java.util.Scanner;

public class Exercicio10CustoCarroNovo {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Cálculo de Custo de Carro Novo");
		System.out.println("Digite o valor do Custo de Fábrica do Carro:");
		float custoFabrica = sc.nextFloat();

		//todo número inteiro digitado diretamente no código (como 28 ou 100) é tratado nativamente como do tipo int. Para concertar isso é necessário colocar um 'f' junto ao número.

		float distribuidor = 28;
		float impostos = 45;

		float custoConsumidor = custoFabrica+custoFabrica*distribuidor/100+custoFabrica*impostos/100;

		System.out.printf("\nCusto de Fábrica: %.2f\nDistribuidor: %.2f %%\nImpostos: %.2f %%\n\nO Valor final para o consumidor é de R$%.2f", custoFabrica, distribuidor, impostos, custoConsumidor);

		sc.close();


	}
}
