package introdu��o_a_programa�ao;
import java.util.Scanner;
public class exercicio_while_2 {

	public static void main(String[] args) {
		/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a 
		senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a 
		pedir as informa��es.*/
        
		String usuario;
		String senha;
		Scanner ler=new Scanner(System.in);
		   System.out.println("Crie um nome de usuario:");
		          usuario=ler.next();
		   System.out.println("crie uma Senha:");
		          senha=ler.next();
		while(usuario. equals(senha)) {
			System.out.println("erro, o usuario n�o pode ser igual a senha!!!");
			System.out.println("Crie um nome de usuario:");
	          usuario=ler.next();
	        System.out.println("Crie uma Senha:");
	          senha=ler.next();
		}
		System.out.println("seja bem vindo!");
	  ler.close();
	}

}
