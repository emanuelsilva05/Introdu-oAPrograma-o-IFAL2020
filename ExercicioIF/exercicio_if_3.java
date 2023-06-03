package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_if_3 {
	
	public static void main(String[] args) {
	    
		double numero;
	    Scanner ler=new Scanner(System.in);
	  
	    System.out.println("Digite um número qualquer:");
	      numero=ler.nextDouble();
	
	  if (numero % 2 == 0) {
		System.out.println("o numero " + numero + " é par");
	} else {
		System.out.println("o numero "+ numero + " é impar");
	}
	
	  ler.close();
	}

}
