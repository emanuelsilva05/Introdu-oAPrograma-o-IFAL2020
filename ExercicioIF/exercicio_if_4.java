package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_if_4 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner ler=new Scanner(System.in);
		   
		    System.out.println("Digite um número inteiro:");
	          A=ler.nextInt();
	        System.out.println("Digite outro número inteiro:");
	          B=ler.nextInt();
	 if(A == B) {
		C = A+B;
	 }else {
		C = A*B;
	 }
	    System.out.println(C); 
	   ler.close();
	}

}
