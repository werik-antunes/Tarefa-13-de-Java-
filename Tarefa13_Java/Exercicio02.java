package tarefa13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 2) Calcular o quadrado de um número: Desenvolva um método que receba um
		 * número como argumento e retorne o quadrado desse número.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int quadrado = Quadrado(numero);
		System.out.println("O quadrado de " + numero + " é: " + quadrado);
		sc.close();
	}

	public static int Quadrado(int numero) {
		return numero * numero;
	}
}
