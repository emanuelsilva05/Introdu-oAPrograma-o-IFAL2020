package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_while_1 {

	public static void main(String[] args) {
		/* Fa�a um programa que pe�a uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.*/
         double nota =0;
         Scanner ler=new Scanner(System.in);
              
              System.out.println("Digite uma nota,entre 0-10:");
                     nota=ler.nextDouble();
	 while(nota> 10) {
		 System.out.println("Digite uma nota,entre 0-10:");
		        nota=ler.nextDouble();
	 }
	
	
	  ler.close();
	}

}
