
package lista2;

import java.util.Scanner;

public class SalaRetangular {

     public static void main(String[] arg) {
		double base, altura, areaSala;
		Scanner in = new Scanner(System.in);
		System.out.println("Calculando a area da sala retangular:" + "\nInforme o tamanho do lado 1:");
		base = in.nextDouble();
		System.out.println("Informe o tamanho do lado 2:");
		altura = in.nextDouble();
		areaSala = base * altura;
		System.out.println("O tamanho da area da sala rentangular é: " + areaSala);
		
		in.close();
	}
}
