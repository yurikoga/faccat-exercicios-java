package apostilaFaccat;

//24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total.

import java.util.Scanner;

public class Exercicio24VendasEfetuadas {
	static void main() {
		Scanner sc = new Scanner(System.in);
		float salarioFixo, valorVendas, salarioVenda, salarioTotal,valorQueUltrapassa;
		float[]valores = new float[3];
		valores[0] = 3f/100;//commisão de 3%
		valores[1] = 5f/100;//comissão de 5%
		valores[2] = 1500;//
		System.out.println("Digite seu salário fixo:");
		salarioFixo = sc.nextFloat();
		System.out.println("Digite o valor das suas vendas este mês:");
		valorVendas = sc.nextFloat();
		if(valorVendas <= valores[2]){
			salarioVenda = valorVendas*valores[0];
			salarioTotal = salarioFixo+salarioVenda;
			System.out.printf("Salário fixo: %.2f\nValor das vendas: %.2f\nCommissão pelas vendas: %.2f\nSalário Total: %.2f", salarioFixo,valorVendas,salarioVenda,salarioTotal);
		}else{
			valorQueUltrapassa = valorVendas-valores[2];
			salarioVenda = valores[2]*valores[0]+valorQueUltrapassa*valores[1];
			salarioTotal = salarioFixo+salarioVenda;
			System.out.printf("Salário fixo: %.2f\nValor das vendas: %.2f\nCommissão pelas vendas: %.2f\nSalário Total: %.2f", salarioFixo,valorVendas,salarioVenda,salarioTotal);
		}
		sc.close();
	}
}
