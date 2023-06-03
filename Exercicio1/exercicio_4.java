package introdução_a_programaçao;
import java.util.Scanner;
public class exercicio_4 {

	public static void main(String[] args) {
		String nome;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        Scanner ler4=new Scanner(System.in);
   
    System.out.println("Seja Bem vindo ao SIGAA!!");
    System.out.println("Para saber foi aprovado em introdução à programação");
    System.out.println("informe seu nome:");
	    nome=ler4.nextLine();
    System.out.println("digite a nota do 1° Bimestre:");
	    nota1= ler4.nextInt();
    System.out.println("digite a nota do 2° Bimestre:");
        nota2= ler4.nextInt();
    System.out.println("digite a nota do 3° Bimestre:");
        nota3= ler4.nextInt();
    System.out.println("digite a nota do 4° Bimestre:");
        nota4= ler4.nextInt();
	
	    media=(nota1 + nota2 + nota3 + nota4)/4;
	    System.out.println("Olá, " + nome + ", sua Media foi: "+ media);
	
	 if (media >= 6) {
		 
		System.out.println("Parabéns, você foi aprovado!!!");
	
	 } else {
		
		System.out.println("Que triste, você não atingiu a media!!");
		System.out.println("Não desanima, você consegue passar na recuperação!");
	
	  ler4.close();
	}
	
	}

}
