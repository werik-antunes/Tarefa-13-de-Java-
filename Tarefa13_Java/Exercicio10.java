package tarefa13;

import java.util.Scanner;

public class Exercicio10 {

	public static boolean primo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * 10) Verificar se um número é primo: Implemente uma função que receba um
		 * número inteiro como argumento e retorne verdadeiro se o número for primo e
		 * falso caso contrário.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		if (primo(numero)) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}
		sc.close();
	}

}
