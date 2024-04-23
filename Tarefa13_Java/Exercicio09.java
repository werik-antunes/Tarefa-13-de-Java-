package tarefa13;

import java.util.Scanner;

public class Exercicio09 {

	public static double calcularArea(double base, double altura) {
		double area = base * altura;
		return area;
	}

	public static void main(String[] args) {
		/*
		 * 9) Calcular a área de um retângulo: Desenvolva um método que receba a base e
		 * a altura de um retângulo como parâmetros e retorne a área desse retângulo.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do retângulo: ");
		double base = sc.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		double altura = sc.nextDouble();

		double area = calcularArea(base, altura);
		System.out.println("A área do retângulo é: " + area);
		sc.close();
	}

}
