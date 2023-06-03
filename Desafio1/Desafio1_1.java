package introdução_a_programaçao;
import java.util.Scanner;
public class Desafio1_1 {

/* 1)Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. */

	public static void main(String[] args) {
		int idadePessoa1;
		int idadePessoa2;
		int idadePessoa3;
		int media;
		Scanner ler=new Scanner(System.in);
		   System.out.println("informe sua idade pessoa numero 1:");
		      idadePessoa1=ler.nextInt();
		   System.out.println("informe sua idade pessoa numero 2:");
		      idadePessoa2=ler.nextInt();
		   System.out.println("informe sua idade pessoa numero 3:");
		      idadePessoa3=ler.nextInt();
	  media=(idadePessoa1 + idadePessoa2 + idadePessoa3)/3;
		   
	  if(media <= 25){
		  System.out.println("vocês são da faixa etária Jovens!!");
		
	} if(media > 25 && media < 61) {
		System.out.println("vocês são da faixa etária Adulto!!");
	
	} if (media > 60) {
		System.out.println("vocês são da faixa etária Idoso!!");
	}
	
	
	  ler.close();
	}

}
