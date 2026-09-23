package apostilaFaccat;
import java.util.Scanner;
public class Exercicio37Fruteira {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		float[]precoMorango={2.50f,2.20f};
		float[]precoMaca={1.80f,1.50f};
		float quantidadeMaca,quantidadeMorango,totalMorango,totalMaca,precoFinalMorango,precoFiinalMaca;
		System.out.println("\n\n---PROGRAMA DA FRUTARIA PARA COMPRA DE FRUTAS---");
		System.out.println("Digite a quantidade (em Kg) de Morangos:");
		quantidadeMorango= sc.nextFloat();
		if(quantidadeMorango<6f){
			totalMorango=precoMorango[0]*quantidadeMorango;
			System.out.printf("Valor a ser pago: %.2f\n\n",totalMorango);
		}else {
			totalMorango=precoMorango[1]*quantidadeMorango;
			if(totalMorango>25f) {
				precoFinalMorango = totalMorango - totalMorango * 10 / 100;
				System.out.println("\tDesconto de 10% aplicado");
				System.out.printf("Valor a ser pago: %.2f\n\n", precoFinalMorango);
			}else{
				System.out.printf("Valor a ser pago: %.2f\n\n",totalMorango);
			}
		}
		System.out.println("Digite a quantidade (em Kg) de Maças:");
		quantidadeMaca= sc.nextFloat();
		if(quantidadeMaca<6f){
			totalMaca=precoMaca[0]*quantidadeMaca;
			System.out.printf("Valor a ser pago: %.2f\n\n",totalMaca);
		}else {
			totalMaca=precoMaca[1]*quantidadeMaca;
			if(totalMaca>25f){
				precoFiinalMaca=totalMaca-totalMaca*10/100;
				System.out.println("\tDesconto de 10% aplicado");
				System.out.printf("Valor a ser pago: %.2f\n\n",precoFiinalMaca);
			}else{
				System.out.printf("Valor a ser pago: %.2f\n\n",totalMaca);
			}
		}
	}
}
