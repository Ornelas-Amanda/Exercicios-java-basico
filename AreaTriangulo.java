package lista1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// criando variaveis
		double altura, base, area;

		// iniciando scanner
		Scanner in = new Scanner(System.in);

		System.out.println("Calculando a area do triangulo");
		System.out.println("Valor da base do triangulo:");

		// variavel base recebendo valor de entrada
		base = in.nextDouble();

		System.out.println("Valor da altura do triangulo:");
		// variavel altura recebendo valor de entrada

		altura = in.nextDouble();
		// calculo de area com as variaveis base e altura
		area = ((base * altura) / 2);

		// exibindo resultado
		System.out.println("Resultado do calculo da Area:" + area);

		/* fim do scanner */
		in.close();
	}
}