package introdu��o_a_programa�ao;
import java.util.Scanner;
public class Desafio_2_3 {

	public static void main(String[] args) {
		/*Fa�a um programa para controlar uma baladinha!!
		S� poder�o entrar na baladinha quem tem mais de 18 anos.
		Se a pessoa tiver menos que 18 anos dever� ser exibida 
		uma mensagem:"Desculpe, mas voc� e de menor, fica para a proxima!!"*/
		
		
		int idade;
		Scanner ler=new Scanner(System.in);
		System.out.println("Seja bem vindo a balada!!");
		System.out.println("Por favor, informe sua idade:");
	           idade=ler.nextInt();
	
	 if(idade >= 18) {
		System.out.println("Fique a vontade, pode entrar!!");
	}else {
		System.out.println("Desculpe, mas voc� e de menor, fica para a proxima!!");
	}
	
	ler.close();
	}

}
