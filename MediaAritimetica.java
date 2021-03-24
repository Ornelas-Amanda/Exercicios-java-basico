package lista2;

import java.util.Scanner;

public class MediaAritimetica {

    public static void main(String[]arg){
    double notaA,notaB,notaC,media;
    Scanner in= new Scanner(System.in);
    System.out.println("Informe as 3 notas:");
    notaA= in.nextInt();
    notaB= in.nextInt();
    notaC= in.nextInt();
    media= (notaA+notaB+notaC)/3;
    System.out.println("A media é: "+media);
    in.close();
    }
}
