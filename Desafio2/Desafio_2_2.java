package introdu��o_a_programa�ao;

public class Desafio_2_2 {

	public static void main(String[] args) {
		/*Crie um programa para calcular a tabuada de 5.
		Obs. (Utilizar estrutura de repeti��o)*/
		
		int numero=5;
		int multiplicar = 0;
        while(multiplicar <= 10)
        {
            int resultado = numero * multiplicar;
            System.out.println(resultado);   
            multiplicar++;
        }

	}

}
