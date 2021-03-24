package lista1;

import java.util.Scanner;

public class Idade {

    public static void main(String[] arg) {
		// criando variaveis
		int anoAtual, anoNasc, idade;
		// iniciando scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Descubra sua idade:");
		System.out.println("Ano de nascimento:");
		// variavel anoNasc recebendo valor de entrada
		anoNasc = in.nextInt();
		System.out.println("Ano Atual:");
		// variavel anoAtual recebendo valor de entrada
		anoAtual = in.nextInt();
		// calculo da idade
		idade = anoAtual - anoNasc;
		// apresentado idade
		System.out.println("Sua idade é:" + idade);
		// fim scanner
		in.close();
	}
}

