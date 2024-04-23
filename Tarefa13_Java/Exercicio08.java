package tarefa13;

import java.util.Scanner;

public class Exercicio08 {
	public static long cal(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("O fatorial de um número negativo não está definido.");
		}
		if (numero == 0) {
			return 1;
		}
		long resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*
		 * 8) Calcular o fatorial de um número: Crie uma função que receba um número
		 * inteiro como parâmetro e retorne o fatorial desse número.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		long fatorial = cal(numero);
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
		sc.close();
	}

}
