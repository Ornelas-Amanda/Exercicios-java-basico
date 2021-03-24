
package lista3;

import java.util.Scanner;


public class triangulodif {

   public static void main(String[] arg) {
		double a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe as medias dos 3 lados de seu triangulo: ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		if (a > (b + c) && (b > (a + c)) && (c > (a + b))) {
			System.out.println("Nao é possivel formar um" + " triangulo com essas medidas!");
		} else if (a == b & b == c) {
			System.out.println("Equilatero");
		} else if (a != b && b != c && a != c) {
			System.out.println("Triangulo escaleno");
		} else {
			System.out.println("triangulo isocelos");
		}
		in.close();
	}
}
