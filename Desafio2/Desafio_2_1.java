package introdu��o_a_programa�ao;
import java.util.Scanner;
public class Desafio_2_1 {

	public static void main(String[] args) {
	/*crie um programa para saber se o aluno foi aprovado ou reprovado na disciplina de educa��o fisica.
	Observa��es:
	O aluno ser� aprovado se a sua m�dia for maior que 6 e ser� reprovado se sua m�dia for menor que 6.
	O programa dever� ler 3 notas do aluno para calcular a m�dia.*/
	
		double nota1;
		double nota2;
        double nota3;
        double media;
	    Scanner ler=new Scanner(System.in);
	         System.out.println("Seja bem vindo ao Sigaa, Para saber se foi aprovado em Educa��o Fisica;");
	         System.out.println("digite sua 1� nota:");
	                nota1=ler.nextDouble();
	         System.out.println("digite sua 2� nota:");
	                nota2=ler.nextDouble();
	         System.out.println("digite sua 3� nota:");
	                nota3=ler.nextDouble();
	  media= (nota1+nota2+nota3)/3;
	  if(media >= 6) {
		  System.out.println("Parab�ns, voce foi aprovado(a)!!");
	  }else {
		  System.out.println("Que pena, voce n�o foi aprovado(a)!!");
	  }
	  
	  ler.close();
	}

}
