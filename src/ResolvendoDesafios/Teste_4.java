package ResolvendoDesafios;
/*
fazer um pequeno programa que, baseado na porcentagem visivel da lua
Determinar sua fase e seu Augurio, tendo como base Lobisomen o Apocalipse
Lua nova: Ragabash
'' crescente: Theurge
'' minguante: Galyard
'' cheia: Ahroun
 */

import java.util.Scanner;

public class Teste_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (inicio >= 0 && fim <= 2) {
            System.out.println("Lua nova" + "Ragabash - o/a Trapaceiro(a)"); //trapaceiro
        } else if (fim > inicio && fim <= 96) {
            System.out.println("Lua crescente - o/a Vidente"); //vidente
        } else if (inicio >= fim && fim <= 96) {
            System.out.println("Lua minguante - o/a Artista"); //artista
        } else {
            System.out.println("Lua cheia - o/a Guerreiro(a)");  //guerreiro
        }
    }

}
/*
Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova,
se for entre 3 e 96% é lua crescente, se for entre 97 e 100% é lua cheia,
se for entre 96 e 3% (diminuindo) é lua minguante.
 */