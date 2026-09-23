package apostilaFaccat;

//32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class Exercicio32DecisaoDePlacar {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		String[]time=new String[2];
		String[]gols=new String[2];

		for (byte contadora=0;contadora<time.length;contadora++){
			System.out.printf("Digite o nome do %d° time:",(contadora+1));
			time[contadora]=sc.nextLine();
			byte contadoraDecisao = 0;
			do {
				if(contadoraDecisao>0){
					System.out.println("ERRO!Digite a quantidade de gols novamente!");
				}
				System.out.printf("Digite a quantidade de Gols que %S fez:",time[contadora]);
				gols[contadora]=sc.nextLine();
				contadoraDecisao++;
			}while(!verificacaoGols(gols[contadora]));
		}

		byte[]golsConvertidos=new byte[2];
		for(byte contadora=0;contadora<golsConvertidos.length;contadora++){
			golsConvertidos[contadora]=(byte)Integer.parseInt(gols[contadora]);
		}

		if(golsConvertidos[0]>golsConvertidos[1]){
			System.out.printf("\nTime vencedor: '%S' com %d\nTime perdedor: '%S' com %d",time[0],golsConvertidos[0],time[1],golsConvertidos[1]);
		}else if(golsConvertidos[1]>golsConvertidos[0]){
			System.out.printf("\nTime vencedor: '%S' com %d\nTime perdedor: '%S' com %d ",time[1],golsConvertidos[1],time[0],golsConvertidos[0]);
		}else{
			System.out.printf("Os times '%S' e '%S' estão EMPATADOS!\nCom %d Gols",time[0],time[1],golsConvertidos[0]);
		}
	}

	public static boolean verificacaoGols(String num) {
		if(num == null || num.equals("") ){
			return false;
		}
		for (byte vez=0;vez<num.length();vez++){
			char caracter=num.charAt(vez);
			if (caracter < 48 || caracter > 57) {
				return false;
			}
		}
		return true;
	}
}
