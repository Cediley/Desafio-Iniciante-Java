package ResolvendoDesafios;
/*
um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.
 *///Tabela de preços
// 1 pastel 4,00 R%
// 2 c. quente 4,00R$
// 3 hamburguer 5,00 R$
// 4 sorvete 2,00 R$
// 5 refri 1,00 R$
import java.util.Scanner;

public class Teste_2 {
    public static void main(String[] args) {
        int X, Y;
        float preco = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Qual numero do produto: ");
        X = input.nextInt();
        System.out.println("Quantos vai querer? ");
        Y = input.nextInt();
        if (X == 1) {
            preco  = (float) (4.00 * Y);
        }else if (X == 2) {
            preco  = (float) (4.00* Y);  //implemente sua lógica aqui
        }else if (X == 3) {
            preco  = (float) (5.00 * Y);  //implemente sua lógica aqui
        }else if (X == 4) {
            preco  = (float) (2.00 * Y); //implemente sua lógica aqui
        }else if (X == 5) {
            preco  = (float) (1.00 * Y); //implemente sua lógica aqui
        }

        System.out.printf("Total: R$ %.2f\n",preco);
    }

}
