package introdução_a_programaçao;
 import java.util.Scanner;
public class exercicio_2 {

	public static void main(String[] args) {
		Scanner ler2= new Scanner(System.in);
        int numero;
        System.out.println("Para saber a tabuada");
        System.out.println("informe um Número:");
	    numero = ler2.nextInt();
	    
	      System.out.println(numero + " X 1: " + numero * 1);
	      System.out.println(numero + " X 2: " + numero * 2);
	      System.out.println(numero + " X 3: " + numero * 3);
	      System.out.println(numero + " X 4: " + numero * 4);
	      System.out.println(numero + " X 5: " + numero * 5);
	      System.out.println(numero + " X 6: " + numero * 6);
	      System.out.println(numero + " X 7: " + numero * 7);
	      System.out.println(numero + " X 8: " + numero * 8);
	      System.out.println(numero + " X 9: " + numero * 9);
	      System.out.println(numero + " X 10: " + numero * 10);
	 
	    ler2.close();
	
	}

}
