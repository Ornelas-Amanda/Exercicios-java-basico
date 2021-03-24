package lista1;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] arg) {
		int numero, resultado;
		int i = 1;
		Scanner in = new Scanner(System.in);
		System.out.println(" TABUADA " + "\nqual numero deseja escolher:");
		numero = in.nextInt();
		while (i <= 10) {
			resultado = numero * i;
			i++;
			System.out.println(numero + "x" + i + "=" + resultado);
		}
		in.close();
	}
}
