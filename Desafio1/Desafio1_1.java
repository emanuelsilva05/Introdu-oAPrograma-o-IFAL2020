package introdu��o_a_programa�ao;
import java.util.Scanner;
public class Desafio1_1 {

/* 1)Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa devera verificar se a m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e ent�o, dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada. */

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
		  System.out.println("voc�s s�o da faixa et�ria Jovens!!");
		
	} if(media > 25 && media < 61) {
		System.out.println("voc�s s�o da faixa et�ria Adulto!!");
	
	} if (media > 60) {
		System.out.println("voc�s s�o da faixa et�ria Idoso!!");
	}
	
	
	  ler.close();
	}

}
