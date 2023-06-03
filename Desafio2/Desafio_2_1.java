package introdução_a_programaçao;
import java.util.Scanner;
public class Desafio_2_1 {

	public static void main(String[] args) {
	/*crie um programa para saber se o aluno foi aprovado ou reprovado na disciplina de educação fisica.
	Observações:
	O aluno será aprovado se a sua média for maior que 6 e será reprovado se sua média for menor que 6.
	O programa deverá ler 3 notas do aluno para calcular a média.*/
	
		double nota1;
		double nota2;
        double nota3;
        double media;
	    Scanner ler=new Scanner(System.in);
	         System.out.println("Seja bem vindo ao Sigaa, Para saber se foi aprovado em Educação Fisica;");
	         System.out.println("digite sua 1° nota:");
	                nota1=ler.nextDouble();
	         System.out.println("digite sua 2° nota:");
	                nota2=ler.nextDouble();
	         System.out.println("digite sua 3° nota:");
	                nota3=ler.nextDouble();
	  media= (nota1+nota2+nota3)/3;
	  if(media >= 6) {
		  System.out.println("Parabéns, voce foi aprovado(a)!!");
	  }else {
		  System.out.println("Que pena, voce não foi aprovado(a)!!");
	  }
	  
	  ler.close();
	}

}
