
package lista3;

import java.util.Scanner;

public class consumo {
    public static void main(String[] arg) {
		// criando variaveis
		double l, km, consumo;
		// iniciando scanner
		Scanner in = new Scanner(System.in);

		System.out.println("informe quantos km percorridos: ");
		// variavel km recebendo valor de entrada
		km = in.nextDouble();
		System.out.println("informe quantos litros de combustivel usou: ");
		// variavel l recebendo valor de entrada
		l = in.nextDouble();
		// calculo se consumo de gasolina por litro
		consumo = (km / l);
		// iniciando condiçaõ para consumo
		if (consumo >= 10) {
			System.out.println(consumo + " economico.");
		} else {
			System.out.println(consumo + " Nao é economico.");
		}
		// fim de scanner
		in.close();
	}
}
}
