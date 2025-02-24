/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

package defaultPackage;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alc = 0;
		int gas = 0;
		int dsl = 0;

		System.out.printf(
				"Combustíveis: %n1.álcool%n2.gasolina%n3.diesel%ndigite 4 para finalizar%n digite o número do combustível: %n");

		int codigo = sc.nextInt();

		while (codigo != 4) {
			if (codigo == 1) {
				alc = alc + 1;
			} else if (codigo == 2) {
				gas = gas + 1;
			} else if (codigo == 3) {
				dsl = dsl + 1;
			} else if (codigo == 4) {
				break;
			}
			System.out.printf("digite o número do combustível: %n");
			codigo = sc.nextInt();
		}
		System.out.printf("Programa finalizado. Muito obrigado.%n Álcool: %d%n Gasolina: %d%n Diesel: %d%n", alc, gas, dsl);

		sc.close();
	}
}
