package lista1;

import java.util.Scanner;

public class ConversorDinheiro {

    public static void main(String[] arg) {
		// criando variaveis
		double real, euro, dolar, converA, converB;
		// iniciando scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Convertendo o Real para Dolar e Euro:");
		System.out.println("Valor atual do Dolar:");
		// variavel dolar recebendo valor de entrada
		dolar = in.nextDouble();
		System.out.println("Valor atual do Euro:");
		// variavel euro recebendo valor de entrada
		euro = in.nextDouble();
		System.out.println("Valor em real que deseja converter:");
		real = in.nextDouble();
		// calculo de conversao do real parar dolar:
		converA = real / dolar;
		// calculo de conversao do real para euro:
		converB = real / euro;
		// apresentaçao dos resultados
		System.out.println("VAlor convertido:" + "\ndolar:" + converA + "" + "\neuro:" + converB);
		// fim do scanner
		in.close();

	}
}

