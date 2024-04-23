package tarefa13;

import java.util.Scanner;

public class Exercicio06 {

	public static int Maximo(int num1, int num2) {
		
		return num1 > num2 ? num1 : num2;
	}

	public static void main(String[] args) {
		/*
		 * 6) Calcular o máximo entre dois números: Implemente uma função que receba
		 * dois números como parâmetros e retorne o maior deles.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int maximo = Maximo(numero1, numero2);
		System.out.println("O máximo entre " + numero1 + " e " + numero2 + " é: " + maximo);
		sc.close();
	}
}
