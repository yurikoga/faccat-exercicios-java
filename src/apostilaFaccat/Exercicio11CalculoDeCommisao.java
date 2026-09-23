package apostilaFaccat;/*
- Feito pelo celular -
 * 11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas 
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
vendedor.
 * 
 */
import java.util.Scanner;

public class Exercicio11CalculoDeCommisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Programa Cálculo de Comissao");
		System.out.println("Digite o valor de seu Salário Fixo:");
		float salarioFixo = sc.nextFloat();
		System.out.println("Digite o valor da comissão por carro vendido:");
		float valorDaComissaoIndividual = sc.nextFloat();
		System.out.println("Digite a quantidade de carros vendidos neste mês:");
		short carrosVendidos = sc.nextShort();

		float valorTotalDaComissao = carrosVendidos*valorDaComissaoIndividual;
		
		float bonus5porcento = valorTotalDaComissao*5/100.0f;
		
		float salarioFinal = salarioFixo+valorTotalDaComissao+bonus5porcento;
		
		System.out.printf("\nSalário fixo: R$ %.2f\nQtd. carros vendidos este mês: %d \nComissão por carro vendido: %.2f \nBônus de 5%% pelas vendas: %.2f \nSalário Final: %.2f\n",salarioFixo,carrosVendidos,valorDaComissaoIndividual,bonus5porcento,salarioFinal);
		
		sc.close();
}
				
				
}