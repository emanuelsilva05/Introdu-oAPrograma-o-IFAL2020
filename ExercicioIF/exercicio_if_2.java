package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_if_2 {

	public static void main(String[] args) {
		String nome;
		char sexo;
        String estadoCivil;
          Scanner ler= new Scanner(System.in);
           
           System.out.println("digite seu nome:");
              nome=ler.next();
           System.out.println("Se For do sexo masculino digite 'M' se for Feminino digite 'F':");
              sexo=ler.next().charAt(0);
           System.out.println("digite seu Estado Civil em Maiusculo:");
              estadoCivil=ler.next();
              
        if (sexo == 'F' && estadoCivil.equals("CASADA")) {
        	System.out.println(nome + " digite o tempo de Casada em anos");
        }
        
        ler.close();
	}

}
