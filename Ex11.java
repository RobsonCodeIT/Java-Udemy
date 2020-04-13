//Exercício 1 - Ler 2 valores inteiros e mostrar a soma. Ex.: 10 20 SOMA = 30

import  java.util.Scanner;

public class Ex11 {
        public static void main(String[] args) {

                Scanner ler = new Scanner(System.in);

                int     n1, n2, soma;

                n1 = ler.nextInt();
                n2 = ler.nextInt();

                soma = n1 + n2;

                System.out.println("SOMA = " + soma);

                ler.close();
        }
}
