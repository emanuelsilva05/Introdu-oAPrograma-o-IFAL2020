package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_if_7 {

	public static void main(String[] args) {
		/* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
	calcule seu peso ideal, utilizando as seguintes fórmulas: 
	● para homens: (72.7 * h) – 58; 
	● para mulheres: (62.1 * h) – 44.7 */
        
		double altura;
        int sexo;
        double pesoIdeal;
        Scanner ler=new Scanner(System.in);
           System.out.println("Digite sua altura:");
	          altura=ler.nextDouble();
	       System.out.println("Digite 1-se for do sexo masculino");
	       System.out.println("Digite 2-se for do sexo feminino");
	          sexo=ler.nextInt();
	          
	       if(sexo == 1) {
	    	   pesoIdeal= (72.7 * altura) - 58;
	    	   System.out.println("Seu peso ideal é: "+ pesoIdeal);
	       } else {
	    	   pesoIdeal=(62.1 * altura) - 44.7;
	    	   System.out.println("Seu peso ideal é: "+ pesoIdeal);
	       }
	          
	       ler.close();
	}

}
