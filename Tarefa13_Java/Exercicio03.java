package tarefa13;

import java.util.Scanner;

public class Exercicio03 {

		public static String Numero(int num){
			if(num > 0) {
				return "O número é positivo";
			}else if(num < 0) {
				return "O número é negativo";
			}else {
				return"O número é zero";
			}
		}
	public static void main(String[] args) {
		/*
		 * 3) Verificar se um número é positivo, negativo ou zero: Implemente um método
		 * que receba um número como parâmetro e retorne uma mensagem indicando se o
		 * número é positivo, negativo ou zero.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		String mensagem  =  Numero(num);
		System.out.println(mensagem);
		sc.close();
	}
}

