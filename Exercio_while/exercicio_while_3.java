package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_while_3 {

	public static void main(String[] args) {
		/*Fa�a um programa que leia e valide as seguintes informa��es:
		Nome: maior que 3 caracteres;Idade: entre 0 e 150;Sal�rio:
		maior que zero;Sexo: 'f' ou 'm';Estado Civil: 's', 'c', 'v', 'd'*/
		String nome;
		int idade;
		double salario;
		char sexo;
		char estadoCivil;
		Scanner ler=new Scanner(System.in);
		   System.out.println("Digite seu Nome:");
		          nome=ler.next();
		   System.out.println("Digite sua Idade:");
		          idade=ler.nextInt();
		   System.out.println("Digite seu Sal�rio:");
		          salario=ler.nextDouble();
		   System.out.println("Digite seu Sexo 'f' ou 'm':");
		          sexo=ler.next().charAt(0);
		   System.out.println("Digite seu Estado Civil 's', 'c', 'v'ou 'd':");
		          estadoCivil=ler.next().charAt(0);
		   
		while(nome.length()< 3 && idade<150 && salario>0 && sexo=='f' && sexo=='m'&& estadoCivil=='s' && estadoCivil=='c'&& estadoCivil=='v'&& estadoCivil=='d')  {
			System.out.println("inv�lido!!");
			System.out.println("Digite seu Nome:");
	          nome=ler.next();
	        System.out.println("Digite sua Idade:");
	          idade=ler.nextInt();
	        System.out.println("Digite seu Sal�rio:");
	          salario=ler.nextDouble();
	        System.out.println("Digite seu Sexo:");
	          sexo=ler.next().charAt(0);
	        System.out.println("Digite seu Estado Civil:");
	          estadoCivil=ler.next().charAt(0);
		} 
		   ler.close();
	}

}
