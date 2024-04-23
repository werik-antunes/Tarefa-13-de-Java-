package tarefa13;

import java.util.Scanner;

public class Exercicio07 {

	public static boolean palindromo(String texto) {

		texto = texto.replaceAll("\\s+", "").toLowerCase();

		String invertido = new StringBuilder(texto).reverse().toString();

		return texto.equals(invertido);
	}

	public static void main(String[] args) {
		/*
		 * 7) Verificar se uma string é palíndromo: Escreva um método que receba uma
		 * string como argumento e retorne verdadeiro se a string for um palíndromo e
		 * falso caso contrário.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String texto = sc.nextLine();
		if (palindromo(texto)) {
			System.out.println("A string é um palíndromo.");
		} else {
			System.out.println("A string não é um palíndromo.");
			sc.close();
		}

	}
}
