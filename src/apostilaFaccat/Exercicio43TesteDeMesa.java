package apostilaFaccat;
import java.util.Scanner;
/**<article>
 <h2>Exercício 43</h2>
 <p>Seja o seguinte algoritmo:</p>

 <pre><code>inicio
 ler a, b, c
 se (a &lt; b+c) e (b &lt; a+c) e (c &lt; a+b) então
 se (a=b) e (b=c) então
 mens &leftarrow; 'Triângulo Equilátero'
 senão
 se (a=b) ou (b=c) ou (a=c) então
 mens &leftarrow; 'Triângulo Isósceles'
 senão
 mens &leftarrow; 'Triângulo Escaleno'
 fim_se
 fim_se
 senão
 mens &leftarrow; 'Não é possível formar um triângulo'
 fim_se
 escrever mens
 fim</code></pre>

 <p>Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das variáveis:</p>

 <table border="1" cellpadding="8" cellspacing="0">
 <thead>
 <tr>
 <th>a</th>
 <th>b</th>
 <th>c</th>
 <th>Mens</th>
 </tr>
 </thead>
 <tbody>
 <tr>
 <td>1</td>
 <td>2</td>
 <td>3</td>
 <td>'Não é possível formar um triângulo'</td>
 </tr>
 <tr>
 <td>3</td>
 <td>4</td>
 <td>5</td>
 <td>'Triângulo Escaleno'</td>
 </tr>
 <tr>
 <td>2</td>
 <td>2</td>
 <td>4</td>
 <td>'Não é possível formar um triângulo'</td>
 </tr>
 <tr>
 <td>4</td>
 <td>4</td>
 <td>4</td>
 <td>'Triângulo Equilátero'</td>
 </tr>
 <tr>
 <td>5</td>
 <td>3</td>
 <td>3</td>
 <td>'Triângulo Isósceles'</td>
 </tr>
 </tbody>
 </table>
 </article>*/
public class Exercicio43TesteDeMesa {
	static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte a,b,c;
		String mens;
		System.out.print("a:");
		a=sc.nextByte();
		System.out.print("b:");
		b=sc.nextByte();
		System.out.print("c:");
		c=sc.nextByte();
		if((a<b+c)&&(b<a+c)&&(c<b+a)){
			if ((a==b)&&(b==c)){
				mens="Triângulo Equilátero";
			}else{
				if((a==b)||(b==c)||(a==c)){
					mens="Triângulo Isósceles";
				}else{
					mens="Triângulo Escaleno";
				}
			}
		}else{
			mens="Não foi possível formar um Triângulo";
		}
		System.out.println(mens);
	}
}
