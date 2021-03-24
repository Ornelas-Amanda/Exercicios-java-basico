package lista2;

import java.util.Scanner;


public class DividaMaxima {

    public static void main(String[] arg) {
		// criando variaveis
		double salario, maxima, divida;
		// iniciando scanner
		Scanner in = new Scanner(System.in);

		System.out.println("Descubra o quanto voce pode se endividar:" + "\nInforme seu salario:");
		// variavel salario recebendo valor de entrada
		salario = in.nextDouble();
		System.out.println("\nInforme possivel divida:");
		// variavel divida recebendo valor de entrada
		divida = in.nextDouble();
		// calculo da porcentagem da divida
		maxima = (salario * 30) / 100;
		// iniciando condiçao
		if (divida > maxima) {
			System.out.println("O valor da divida ultrapassa 30% do seu salario " + salario
					+ "\nseu valor maximo de divida é:" + maxima);
		}

		else if (divida < maxima) {
			System.out.println(
					"Sua divida não prejudicaria seu salario:" + salario + "\nseu valor maximo de divida é:" + maxima);

		}
		// fim de codicao
		// fim de scanner
		in.close();

	}
}
