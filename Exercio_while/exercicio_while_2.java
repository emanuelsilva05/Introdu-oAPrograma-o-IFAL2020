package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_while_2 {

	public static void main(String[] args) {
		/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
		senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a 
		pedir as informações.*/
        
		String usuario;
		String senha;
		Scanner ler=new Scanner(System.in);
		   System.out.println("Crie um nome de usuario:");
		          usuario=ler.next();
		   System.out.println("crie uma Senha:");
		          senha=ler.next();
		while(usuario. equals(senha)) {
			System.out.println("erro, o usuario não pode ser igual a senha!!!");
			System.out.println("Crie um nome de usuario:");
	          usuario=ler.next();
	        System.out.println("Crie uma Senha:");
	          senha=ler.next();
		}
		System.out.println("seja bem vindo!");
	  ler.close();
	}

}
