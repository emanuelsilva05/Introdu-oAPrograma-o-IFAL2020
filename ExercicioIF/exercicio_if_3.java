package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_if_3 {
	
	public static void main(String[] args) {
	    
		double numero;
	    Scanner ler=new Scanner(System.in);
	  
	    System.out.println("Digite um n�mero qualquer:");
	      numero=ler.nextDouble();
	
	  if (numero % 2 == 0) {
		System.out.println("o numero " + numero + " � par");
	} else {
		System.out.println("o numero "+ numero + " � impar");
	}
	
	  ler.close();
	}

}
