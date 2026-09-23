package apostilaFaccat;

import java.util.Scanner;
/**<article>
 <h2>Exercício 41</h2>
 <p>Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação.</p>

 <p>Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:</p>

 <div>
 <p><strong>Fórmula da Média de Aproveitamento:</strong></p>
 <p><code>Média_de_Aproveitamento = (N1 + (N2 * 2) + (N3 * 3) + Média_dos_Exercícios) / 7</code></p>
 </div>

 <p>A atribuição de conceitos obedece à tabela abaixo:</p>

 <table border="1" cellpadding="8" cellspacing="0">
 <thead>
 <tr>
 <th>Média de Aproveitamento</th>
 <th>Conceito</th>
 </tr>
 </thead>
 <tbody>
 <tr>
 <td>&ge; 9,0</td>
 <td>A</td>
 </tr>
 <tr>
 <td>&ge; 7,5 e &lt; 9,0</td>
 <td>B</td>
 </tr>
 <tr>
 <td>&ge; 6,0 e &lt; 7,5</td>
 <td>C</td>
 </tr>
 <tr>
 <td>&lt; 6,0</td>
 <td>D</td>
 </tr>
 </tbody>
 </table>
 </article>*/
public class Exercicio41MediaDeAproveitamento {
	static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float mediaAproveitamento,m,mediaExercicios=2,notas[]=new float[3];
		char conceito;
		for(byte contadora=0;contadora<notas.length;contadora++){
			System.out.printf("Digite a %d° nota:",(contadora+1));
			notas[contadora]=sc.nextFloat();
		}
		mediaAproveitamento=(notas[0]+(notas[1]*2)+(notas[2]*3)+mediaExercicios)/7;
		m = mediaAproveitamento;
		conceito=m >=9.0?'A': m >=7.5 && m <9.0?'B': m>=6.0 && m < 7.5?'C':'D';
		System.out.printf("Conceito: %S",conceito);

	}
}
