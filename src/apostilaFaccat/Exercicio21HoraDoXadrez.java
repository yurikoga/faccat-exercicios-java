package apostilaFaccat;

//21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class Exercicio21HoraDoXadrez {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicio, horaTermino,tempoJogo;
		System.out.println("Digite a hora de início do jogo:");
		horaInicio = sc.nextInt();
		System.out.println("Digite a hora do fim do jogo:");
		horaTermino = sc.nextInt();
		if(horaInicio < horaTermino){
			tempoJogo = horaTermino-horaInicio;
			System.out.printf("Ocorreram %d horas de jogo",tempoJogo);
		}else{
			//24 - horaInicio é = ao tempo de inicio do jogo até meia-noite
			//hora do termino é = a marca de tempo de meia-noite até o término do jogo
			tempoJogo = 24-horaInicio+horaTermino;
			System.out.printf("Aconteceram %d horas de jogo\n",tempoJogo);
		}
	}
}
