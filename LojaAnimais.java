package lista2;

import java.util.Scanner;

public class LojaAnimais {

     public static void main(String[] arg) {
		double qtdeCoelhos, custo;
		Scanner in = new Scanner(System.in);

		System.out.println("Custo da loja de Coelhos:" + "\nInforme a quantidade de coelhos:");
		qtdeCoelhos = in.nextDouble();
		custo= (qtdeCoelhos * 0.70) / 18 + 10;

		System.out.println("Com " + qtdeCoelhos + " coelhos," + "A loja terá um custo de: " + custo);
		in.close();
	}
}
