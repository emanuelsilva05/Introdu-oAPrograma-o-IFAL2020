package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_if_1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double A;
		double B;
		double C;
		System.out.println("Digite um valor A:");
		A= ler.nextDouble();
		System.out.println("Digite um valor B:");
		B= ler.nextDouble();
		System.out.println("Digite um valor C:");
		C= ler.nextDouble();
		
		if((A+B) < C) {
			
	      System.out.println("A soma de A + B � menor Que C");
		}  else {
			
		  System.out.println("A soma de A + B � maior Que C");
		}
		
		ler.close();
	}

}
