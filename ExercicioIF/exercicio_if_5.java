package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_if_5 {

	public static void main(String[] args) {
		/*Fa�a um programa que leia uma vari�vel e some 5 caso 
		seja par ou some 8 caso seja �mpar,
		imprimir o resultado desta opera��o.*/

		double A;
		Scanner ler=new Scanner(System.in);
	       System.out.println("Digite um n�mero:");
             A=ler.nextDouble();
		if(A % 2==0) {
			System.out.println(A + 5);	
		} else {
			System.out.println(A + 8);
		}
	
           
           
           ler.close();
	}

}
