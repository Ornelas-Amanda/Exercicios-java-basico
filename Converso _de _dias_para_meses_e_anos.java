
package lista1;
import java.util.Scanner;
public class NumeroDias {
    public static void main(String []arg){
    double dias,meses,anos;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Convertendo dias em meses e anos:");
    System.out.println("Numeros de dias:");
    dias = in.nextDouble();
    meses = dias/30;
    anos = dias/365;
    System.out.println("Dias convertidos em meses:"+meses+ "\nem anos:"+anos);
    in.close();
    }
}


