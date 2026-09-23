package apostilaFaccat;/*
- Feito pelo celular -
12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo): 
(C/5) = ((F-32)/9)
Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F*/

import java.util.Scanner;

public class Exercicio12ConversaoDeTemperatura {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Programa Conversao de Temperatura");
	System.out.println("Digite o valor da temperatura a ser comvertida:");
	float temperaturaFahrenheit	= sc.nextFloat();
		
	float temperaturaConvertida = (temperaturaFahrenheit-32)/9f*5;
		
	System.out.printf("A temperatura %.1f F°, convertida para Celcius fica %.1f",temperaturaFahrenheit,temperaturaConvertida);	
}
	
}