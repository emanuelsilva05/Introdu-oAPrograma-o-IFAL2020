package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_5 {

	public static void main(String[] args) {
		int anoNascimento;
        int anoAtual;
        int idade;
        Scanner ler5 =new Scanner(System.in);
		  System.out.println("Para saber sua idade");
		  System.out.println("digite o ano de nascimento:");
				   anoNascimento=ler5.nextInt();
		  System.out.println("digite o ano atual:");
				   anoAtual=ler5.nextInt();
				   
        idade= anoAtual - anoNascimento;
	       System.out.println("Você vai completar ou tem " + idade + " anos.");
	
	  ler5.close();
	}

}
