package introdu��o_a_programa�ao;
import java.util.Scanner;
public class Desafio_1_3 {

/* 3)Fa�a um programa que pe�a um numero inteiro positivo e em seguida mostre este numero invertido.
Ex:12376489
Deve exibir => 98467321 */

	public static void main(String[] args) {
		
		int numero;
		Scanner ler = new Scanner(System.in);
		 
		System.out.println("Digite a seguir o n�mero a ser invertido: ");
		     numero=ler.nextInt();
		
		int i = 0;

		 while (numero > 0) {
		 i *= 10;
		 i += (numero % 10);
		 numero /= 10;
		 } 
		 
		 System.out.printf("O n�mero invertido �: %d.\n", i);
       
		 ler.close();
	}

}
