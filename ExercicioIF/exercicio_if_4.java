package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_if_4 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner ler=new Scanner(System.in);
		   
		    System.out.println("Digite um n�mero inteiro:");
	          A=ler.nextInt();
	        System.out.println("Digite outro n�mero inteiro:");
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
