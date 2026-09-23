package apostilaFaccat;

/*
* 26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
* quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
* média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
* a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
* compra'.
* */
import java.util.Scanner;
public class Exercicio26QuantidadeEmEstoque {
	static void main() {
		Scanner sc = new Scanner(System.in);
		int quantidadeAtual, quantidadeMax, quantidadeMin, quantidadeMedia;
		System.out.println("PROGRAMA - QUANTIDADE EM ESTOQUE");
		System.out.println("Digite a quantidade máxima em estoque");
		quantidadeMax = sc.nextInt();
		System.out.println("Digite a quantidade mínima em estoque:");
		quantidadeMin = sc.nextInt();
		quantidadeMedia = (quantidadeMax+quantidadeMin)/2;
		System.out.println("Digite a quantidade atual em estoque:");
		quantidadeAtual = sc.nextInt();
		if (quantidadeAtual < quantidadeMedia){
			System.out.printf("Quantidade média: %d\nQuantidade atual: %d\nEfetuar compra",quantidadeMedia,quantidadeAtual);
		}else {
			System.out.printf("Quantidade média: %d\nQuantidade atual: %d\nNão efetuar compra",quantidadeMedia,quantidadeAtual);
		}
		sc.close();
	}
}
