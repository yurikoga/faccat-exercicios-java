package apostilaFaccat;
/*
* 25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
* calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar
* se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão
* escrever a mensagem 'Saldo Negativo'.
* */

import java.util.Scanner;

public class Exercicio25ContaDoCliente {
	static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAMA - CONTA DO CLIENTE");
		String numeroConta;
		float saldo, debito, credito, saldoAtual;
		//número de conta
		System.out.println("Digite o número da sua conta:\n(Exemplo: 12345-6)");
		numeroConta = sc.nextLine();
		//saldo
		System.out.println("Digite o valor do seu saldo:");
		saldo = sc.nextFloat();
		//débito
		System.out.println("Digite o valor do seu débito:");
		debito = sc.nextFloat();
		//crédito
		System.out.println("Digite o valor do seu crédito:");
		credito = sc.nextFloat();
		//saldo atual = saldo - débito + crédito
		saldoAtual = saldo-debito+credito;
		//(saldo >= 0) "Saldo positivo"
		if (saldoAtual >= 0){
			System.out.printf("\nOlá portador da conta %S !\nO seu Saldo atual é: %.2f\nSaldo Positivo\n",numeroConta,saldoAtual);
		}else {
			System.out.printf("\nOlá portador da conta %S !\nO seu Saldo atual é: %.2f\nSaldo Negativo\n",numeroConta,saldoAtual);
		}
		sc.close();
	}
}
