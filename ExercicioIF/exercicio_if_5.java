package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_if_5 {

	public static void main(String[] args) {
		/*Faça um programa que leia uma variável e some 5 caso 
		seja par ou some 8 caso seja ímpar,
		imprimir o resultado desta operação.*/

		double A;
		Scanner ler=new Scanner(System.in);
	       System.out.println("Digite um número:");
             A=ler.nextDouble();
		if(A % 2==0) {
			System.out.println(A + 5);	
		} else {
			System.out.println(A + 8);
		}
	
           
           
           ler.close();
	}

}
