package introdução_a_programaçao;
import java.util.Scanner;         //importar o pacote java.util//
public class exercicio_1 {

	public static void main(String[] args) {
		Scanner ler1 = new Scanner(System.in);  //criar um objeto Scanner//
		String nome;
		System.out.println("Digite seu nome: ");
		nome = ler1.nextLine();            //ler um valor//
        System.out.println("Olá, " + nome);
        ler1.close();             //desativar//
	}

}
