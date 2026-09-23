package apostilaFaccat;

//22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class Exercicio22HorasExtras {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short horasTrabalhadas, horasExtras;
		short horasPadrao = 40*4;
		float salarioHora, salarioHoraExtra, salarioTotal;

		System.out.println("Digite a quantidade de horas trabalhadas este mês:");
		horasTrabalhadas = sc.nextShort();
		System.out.println("Digite quanto recebe por hora:");
		salarioHora = sc.nextFloat();

		if(horasTrabalhadas <= horasPadrao){
			salarioTotal = horasTrabalhadas*salarioHora;
			System.out.printf("Horas trabalhadas: %d horas\nSalário por hora: %.2f\nSalário Total: %.2f\n",horasTrabalhadas,salarioHora,salarioTotal);
		}else {
			horasExtras = (short)(horasTrabalhadas-horasPadrao);
			salarioHoraExtra = horasExtras*salarioHora+(horasExtras*salarioHora*50f/100);
			salarioTotal = horasPadrao*salarioHora+salarioHoraExtra;
			System.out.printf("Horas trabalhadas: %d horas\nSalário por hora: %.2f\nHora extra: %d horas\nSalário - Hora Extra: %.2f\nSalário Total: %.2f\n",horasTrabalhadas,salarioHora,horasExtras,salarioHoraExtra,salarioTotal);
		}


	}
}
