
package lista2;

import java.util.Scanner;


public class ConversaoF {

   public static void main(String[] arg) {
		// criando variaveis
		double f, c;
		// iniciando scanner
		Scanner in = new Scanner(System.in);

		System.out.println("Converta Fahrenheit em Celcius:" + "\nInforma Temperatura:");
		// variavel f recebendo valor de entrada
		f = in.nextDouble();
		// calculo de conversao
		c = (f - 32) * 5 / 9;
		System.out.println("A conversão de " + f + " Fahrenheit" + "em Celsius é:" + c);
		// fim de scanner
		in.close();
	}
}