package ResolvendoDesafios;
/*
Neste desafio, dados os valores dos três créditos da máquina,
o programa deve dizer se é ou não possível viajar no tempo e voltar para o presente,
fazendo pelo menos uma viagem e, no máximo, três viagens;
sempre usando cada um dos três créditos no máximo uma vez.
 */

import java.util.Scanner;

public class Teste_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeiro valor de créditos: ");
        int a = scan.nextInt();
        System.out.println("Segundo valor de créditos: ");
        int b = scan.nextInt();
        System.out.println("Terceiro valor de créditos: ");
        int c = scan.nextInt();
        if (a + b == c || a + c == b ||c + b == a|| a == b ||b == c||c == a)
            System.out.println("Você poderá voltar para o presente! :)");
        else
            System.out.println("Você não poderá voltar para o presente! :(");
    }

}

/*
Como funciona:
Imagine o seguinte cenário, você desenvolveu uma máquina de viagem no tempo
 que pode ser usada no máximo três vezes,
 e a cada uso da máquina você pode escolher ir para o futuro ou voltar para o passado.
 A máquina possui três créditos fixos; cada crédito representa uma certa quantidade de anos,
 e pode ser usado para ir essa quantidade de anos para o passado ou para o futuro.
 Você pode fazer uma, duas ou três viagens,
 e cada um desses três créditos pode ser usado uma vez apenas.
 Por exemplo, se os créditos forem 5, 12 e 9, você poderia decidir fazer duas viagens:
 ir 5 anos para o futuro e, depois, voltar 9 anos para o passado.
 Dessa forma, você terminaria quatro anos no passado, em 2012.
 Também poderia fazer três viagens, todas indo para o futuro,
 usando os créditos em qualquer ordem, terminando em 2042.
 */