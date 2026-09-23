package apostilaFaccat;

//36) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class Exercicio36SomaEProduroDeIdades {
	static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		byte[]idadesMasculino=new byte[2];
		byte[]idadesFeminino=new byte[2];
		byte[]ordemDeTamanho=new byte[4];
		short somaDeIdades, produtoDeIdades;
		byte contadoraDeErros=0;

		System.out.println("--DIGITE A IDADE DE DUAS PESSOAS DO SEXO MASCULINO--");
		for(byte contadora=0;contadora<idadesMasculino.length;contadora++){
			do {
				if (contadoraDeErros>1){
					System.out.println("\tDIGITE UMA IDADE DIFERENTE");
				}
				System.out.printf("Digite a %d° idade:",(contadora+1));
				idadesMasculino[contadora]=sc.nextByte();
				contadoraDeErros++;
			}while (idadesMasculino[0]==idadesMasculino[1]);
		}
		contadoraDeErros=0;
		System.out.println("\n--DIGITE A IDADE DE DUAS PESSOAS DO SEXO FEMININO--");
		for(byte contadora=0;contadora<idadesFeminino.length;contadora++){
			do {
				if(contadoraDeErros>1){
					System.out.println("\tDIGITE UMA IDADE DIFERENTE");
				}
				System.out.printf("Digite a %d° idade:", (contadora + 1));
				idadesFeminino[contadora] = sc.nextByte();
				contadoraDeErros++;
			}while(idadesFeminino[0]==idadesFeminino[1]);
		}
		if(idadesMasculino[0]>idadesMasculino[1]){
			ordemDeTamanho[0]=idadesMasculino[0];
			ordemDeTamanho[1]=idadesMasculino[1];
		}else{
			ordemDeTamanho[0]=idadesMasculino[1];
			ordemDeTamanho[1]=idadesMasculino[0];
		}
		if(idadesFeminino[0]>idadesFeminino[1]){
			ordemDeTamanho[2]=idadesFeminino[0];
			ordemDeTamanho[3]=idadesFeminino[1];
		}else{
			ordemDeTamanho[2]=idadesFeminino[1];
			ordemDeTamanho[3]=idadesFeminino[0];
		}
		somaDeIdades=(short)(ordemDeTamanho[0]+ordemDeTamanho[3]);
		produtoDeIdades=(short)(ordemDeTamanho[1]*ordemDeTamanho[2]);
		System.out.printf("\nHOMEM MAIS VELHO: %d\nHOMEM MAIS NOVO: %d\nMULHER MAIS VELHA: %d\nMULHER MAIS NOVA: %d",ordemDeTamanho[0],ordemDeTamanho[1],ordemDeTamanho[2],ordemDeTamanho[3]);
		System.out.printf("\nA soma da idade do 'HOMEM MAIS VELHO' com a 'MULHER MAIS NOVA' é igual a %d",somaDeIdades);
		System.out.printf("\nO produto da idade da 'MULHER MAIS VELHA' com o 'HOMEM MAIS NOVO' é igual a %d",produtoDeIdades);
	}
}
