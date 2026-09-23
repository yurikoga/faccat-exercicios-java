package apostilaFaccat;
import java.util.Scanner;
/**<article>
 <h2>Exercício 42</h2>
 <p>Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:</p>

 <ul>
 <li>Ter no mínimo <strong>65 anos</strong> de idade;</li>
 <li>Ter trabalhado no mínimo <strong>30 anos</strong>;</li>
 <li>Ter no mínimo <strong>60 anos</strong> e ter trabalhado no mínimo <strong>25 anos</strong>.</li>
 </ul>

 <p>Com base nas informações acima, faça um algoritmo que leia:</p>
 <ul>
 <li>O número do empregado (código);</li>
 <li>O ano de seu nascimento;</li>
 <li>O ano de seu ingresso na empresa.</li>
 </ul>

 <p>O programa deverá escrever:</p>
 <ul>
 <li>A idade do empregado;</li>
 <li>O tempo de trabalho do empregado;</li>
 <li>A mensagem: <code>'Requerer aposentadoria'</code> ou <code>'Não requerer'</code>.</li>
 </ul>
 </article>*/
public class Exercicio42QualificacaoAposentadoria {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short codigoFunc, anoNascimento, anoEntrada, anoAtual = 2026;
		byte idade, tempoEmpresa;
		do{
			System.out.println("Digite seu ID de Funcionário:");
			codigoFunc = sc.nextShort();
			System.out.println("Digite seu Ano de Nascimento:");
			anoNascimento = sc.nextShort();
			System.out.println("Digite o Ano em que entrou na Empresa:");
			anoEntrada = sc.nextShort();
			idade = (byte) (anoAtual - anoNascimento);
			tempoEmpresa = (byte) (anoAtual - anoEntrada);
			if (idade > tempoEmpresa) {
				System.out.printf("\nIdade: %d\n", idade);
				System.out.printf("Tempo de Empresa: %d anos\n", tempoEmpresa);
				if (idade == 60 && tempoEmpresa == 25) {
					System.out.println("Requerer aposentadoria");
				} else if (idade >= 65 || tempoEmpresa >= 30) {
					System.out.println("Requerer aposentadoria");
				} else {
					System.out.println("Não requerer");
				}
			} else {
				System.out.println("Dados Inválidos\n\n");
			}
		}while(idade<tempoEmpresa);
	}
}
