package apostilaFaccat;

import java.util.Scanner;

/**33) Ler dois valores e imprimir uma das três mensagens a seguir:<br>
 ‘Números iguais’, caso os números sejam iguais;<br>
 ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;<br>
 ‘Segundo maior’, caso o segundo seja maior que o primeiro.  */


public class Exercicio33TresMensagens {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		double[]valores=new double[2];
		String[]valoresAntesDaConversao=new String[2];
		String[]valoresDepoisDaConversao=new String[2];
		byte contadora=0;

		do {
			if (contadora>0){
				System.out.println("\tDigite Novamente!");
			}
			System.out.println("Digite o Primeiro Valor númerico:");
			valoresAntesDaConversao[0]=sc.nextLine();
			contadora++;
		}while (!verificarNumero(valoresAntesDaConversao[0]));

		contadora=0;
		do {
			if (contadora>0){
				System.out.println("\tDigite Novamente!");
			}
			System.out.println("Digite o Segundo Valor númerico:");
			valoresAntesDaConversao[1]=sc.nextLine();
			contadora++;
		}while (!verificarNumero(valoresAntesDaConversao[1]));

		 valoresDepoisDaConversao[0]= valoresAntesDaConversao[0].replace(',', '.');
		 valoresDepoisDaConversao[1]= valoresAntesDaConversao[1].replace(',', '.');
		 valores[0]=Double.parseDouble(valoresDepoisDaConversao[0]);
		 valores[1]=Double.parseDouble(valoresDepoisDaConversao[1]);
		 if (valores[1]==valores[0]){
			 System.out.println("Números Iguais");
		 }else if(valores[0]>valores[1]){
			 System.out.println("Primeiro é Maior");
		 }else{
			 System.out.println("Segundo é Maior");
		 }
		sc.close();
	}
	public static boolean verificarNumero(String num){
		if(num == null || num.isEmpty()){
			return false;
		}
		byte contadoraDeVirgulas=0;
		for (byte contadora=0;contadora<num.length();contadora++){
			char character=num.charAt(contadora);
			if(contadora==0&&character == '-'){
				continue;
			}
			if (character==','||character=='.'){
				contadoraDeVirgulas++;
				if (contadoraDeVirgulas>1){
					return false;
				}
				continue;
			}
			if (!Character.isDigit(character)){
				return false;
			}
		}
		if(num.equals('.')||num.equals(',')||num.equals('-')){
			return false;
		}
		return true;
	}
}
