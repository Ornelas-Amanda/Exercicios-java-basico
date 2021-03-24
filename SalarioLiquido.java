
package lista2;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] arg) {
		double valorHora, numeroAulas, salario, salarioTotal;
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("Calculando o salario de um professor:" + "\nInforme horas de aulas dadas:");
		valorHora = in.nextDouble();
		System.out.println("Informe o numero de aulas dadas");
		numeroAulas = in.nextDouble();
		salario = (numeroAulas * valorHora);
		if (salario <= 1045) {
			salarioTotal = salario - ((salario * 7.5) / 100);
			System.out.println("O salario do professor é: " + salarioTotal);
		}
		;
		if (salario > 1045 & salario <= 2089.60) {
			salarioTotal = salario - ((salario * 9) / 100);
			System.out.println("O salario do professor é: " + salarioTotal);
		}
		;
		if (salario > 2089.60 & salario <= 3134.40) {
			salarioTotal = salario - ((salario * 12) / 100);
			System.out.println("O salario do professor é: " + salarioTotal);
		}
		;
		if (salario > 3134.40 & salario <= 6101.06) {
			salarioTotal = salario - ((salario * 14) / 100);
			System.out.println("O salario do professor é: " + salarioTotal);
		}
		;
		in.close();
	}
}