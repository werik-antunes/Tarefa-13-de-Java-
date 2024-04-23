package tarefa13;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 1) Verificar se um número é par ou ímpar: Crie um método que receba um número
		 * inteiro como parâmetro e retorne verdadeiro se o número for par e falso se
		 * for ímpar.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		 int numero = sc.nextInt();
	        if (Par(numero)) {
	            System.out.println(numero + " é par.");
	        } else {
	            System.out.println(numero + " é ímpar.");
	        }
	        sc.close();
	}

	public static boolean Par(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
