package ResolvendoDesafios;
//Neste programa, criarei uma simples tabuada
import java.util.Scanner;

public class Teste_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int N = scan.nextInt();
        System.out.println("1 x " + N + " = " + (N));
        System.out.println("2 x " + N + " = " + (N * 2));
        System.out.println("3 x " + N + " = " + (N * 3));
        System.out.println("4 x " + N + " = " + (N * 4));
        System.out.println("5 x " + N + " = " + (N * 5));
        System.out.println("6 x " + N + " = " + (N * 6));
        System.out.println("7 x " + N + " = " + (N * 7));
        System.out.println("8 x " + N + " = " + (N * 8));
        System.out.println("9 x " + N + " = " + (N * 9));
        System.out.println("10 x " + N + " = " + (N * 10));
    }
}
