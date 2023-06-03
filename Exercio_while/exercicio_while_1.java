package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_while_1 {

	public static void main(String[] args) {
		/* Faça um programa que peça uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
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
