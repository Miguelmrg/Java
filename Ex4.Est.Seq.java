package aksjdh;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		Double valorHora, salario;
		
		System.out.println("digite o número do funcionário: ");
		numero = sc.nextInt();
		System.out.println("digite o número de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("digite a quantia que recebe por hora: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.printf("o salário recebido é de: R$%.2f%ne o número do funcionário é: %d%n", salario, numero);
		
		sc.close();
	}

}
