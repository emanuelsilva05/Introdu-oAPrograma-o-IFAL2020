package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_3 {

	public static void main(String[] args) {
		String nome1 = "Xuxucão";
		String nome2;
            Scanner ler3=new Scanner(System.in);
		System.out.println("digite um nome:");
	    nome2 = ler3.next();
	    System.out.println(nome2 + " " + nome1);
	    
	    ler3.close();
	}

}
