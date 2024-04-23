package tarefa13;

import java.util.Scanner;

public class Exercicio04 {
	
	public static double calcularMedia(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}

	public static void main(String[] args) {
		/*
		 * 4) Calcular a média de três números: Crie uma função que receba três números
		 * como parâmetros e retorne a média desses números.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tres números: ");
		double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
        double media = calcularMedia(num1, num2, num3);
        System.out.println("A média dos números " + num1 + ", " + num2 + " e " + num3 + " é: " + media);
    
		sc.close();
	}

}
