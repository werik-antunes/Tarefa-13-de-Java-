package tarefa13;

import java.util.Scanner;

public class Exercicio05 {

	public static boolean verificar(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	public static void main(String[] args) {
		/*
		 * 5) Verificar se um ano é bissexto: Desenvolva um método que receba um ano
		 * como argumento e retorne verdadeiro se o ano for bissexto e falso caso
		 * contrário.
		 * 
		 */
		System.out.println("Digite um ano: ");
		Scanner sc = new Scanner(System.in);	
		int ano = sc.nextInt();
		if (verificar(ano)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
		sc.close();
	}

}
