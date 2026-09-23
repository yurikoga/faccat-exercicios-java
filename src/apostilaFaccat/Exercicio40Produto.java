package apostilaFaccat;
import java.util.Scanner;

/**
 * <h3>Exercício 40</h3>
 *
 * Faça um algoritmo para ler:
 * <ul>
 *   <li>A descrição do produto (nome)</li>
 *   <li>A quantidade adquirida</li>
 *   <li>O preço unitário</li>
 * </ul>
 *
 * <p>Calcular e escrever:</p>
 * <ul>
 *   <li><b>Total:</b> {@code total = quantidade adquirida * preço unitário}</li>
 *   <li><b>Desconto</b></li>
 *   <li><b>Total a pagar:</b> {@code total a pagar = total - desconto}</li>
 * </ul>
 *
 * <p><b>Regras de Desconto:</b></p>
 * <ul>
 *   <li>Se {@code quantidade <= 5}: desconto de <b>2%</b></li>
 *   <li>Se {@code quantidade > 5} e {@code quantidade <= 10}: desconto de <b>3%</b></li>
 *   <li>Se {@code quantidade > 10}: desconto de <b>5%</b></li>
 * </ul>
 */

public class Exercicio40Produto {
	static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nomeDoProduto;
		int quantidadeAdquirida;
		float precoUnitario,total,totalPagar;
		System.out.println("Digite o nome do produto:");
		nomeDoProduto=sc.nextLine().toUpperCase();
		System.out.println("Digite a quantidade adquirida:");
		quantidadeAdquirida=sc.nextInt();
		System.out.println("Digite o preço unitário:");
		precoUnitario=sc.nextFloat();
		total=quantidadeAdquirida*precoUnitario;
		if(quantidadeAdquirida<=5){
			totalPagar=total-total*2/100;
			System.out.println("\tDesconto de 2% aplicado");
			System.out.println("Total a pagar:"+totalPagar);
		}else if(quantidadeAdquirida>5 && quantidadeAdquirida<=10){
			totalPagar=total-total*3/100;
			System.out.println("\tDesconto de 3% aplicado");
			System.out.println("Total a pagar:"+totalPagar);
		}else{
			totalPagar=total-total*5/100;
			System.out.println("\tDesconto de 5% aplicado");
			System.out.println("Total a pagar:"+totalPagar);
		}
	}
}
