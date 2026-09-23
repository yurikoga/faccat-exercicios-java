package apostilaFaccat;

/**
 * 38) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
 * diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
 * mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
 * esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
 * senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/

import java.util.Scanner;

public class Exercicio38CodigoDoUsuario {
	static void main() {
		Scanner sc=new Scanner(System.in);
		String numeroDigitado;
		short senha=9999,codigo=1234,numeroCodigo,numeroSenha;
		byte contador=0;
		do{
			if(contador>0){
				System.out.println("\tDigite o Código de Usuário Válido");
			}
			System.out.println("DIGITE O CÓDIGO DE USUÁRIO:");
			numeroDigitado=sc.nextLine();
			contador++;
		}while(!verificadorDeNumeros(numeroDigitado));
		contador=0;
		numeroCodigo=(short)Integer.parseInt(numeroDigitado);
		if(numeroCodigo==codigo){
			System.out.println("\n\tUSUÁRIO VÁLIDO\n");
			do{
				if(contador>0){
					System.out.println("\tDigite um Número Válido:");
				}
				System.out.println("DIGITE A SENHA:");
				numeroDigitado=sc.nextLine();
				contador++;
			}while(!verificadorDeNumeros(numeroDigitado));
			numeroSenha=(short)Integer.parseInt(numeroDigitado);
			if(numeroSenha==senha){
				System.out.println("\n\tACESSO PERMITIDO\n");
			}else{
				System.out.println("\n\tSENHA INCORRETA\n");
			}
		}else{
			System.out.println("\n\tUSUÁRIO INVÁLIDO\n");
		}
	}
	public static boolean verificadorDeNumeros(String possivelNumero){
		if(possivelNumero == null || possivelNumero.isEmpty()){
			return false;
		}
		for(short contadora=0;contadora<possivelNumero.length();contadora++){
			char caracter=possivelNumero.charAt(contadora);
			if(!Character.isDigit(caracter)){
				return false;
			}
		}
		return true;
	}
}
