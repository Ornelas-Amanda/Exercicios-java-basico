
package lista3;

import java.util.Scanner;



public class idadeVersaoB {

    public static void main(String[] arg) {
		// criando variaveis
		int at, an, idade;
		// iniciando scanner
		Scanner in = new Scanner(System.in);

		System.out.println("Informe sua data de nascimento: ");
		an = in.nextInt();
		System.out.println("Informe o ano atual: ");
		at = in.nextInt();
		idade = at - an;
		// iniciando codição de idade
		if (idade < 10) {
			System.out.println("criança :" + idade);
		} else if (idade > 10 && idade <= 18) {
			System.out.println("Adolecente :" + idade);
		} else if (idade > 18 && idade <= 60) {
			System.out.println("Adulta :" + idade);
		} else {
			System.out.println("Idoso" + idade);
		}
		// fim da condição de idade

		// fim scanner
		in.close();

	}
}
