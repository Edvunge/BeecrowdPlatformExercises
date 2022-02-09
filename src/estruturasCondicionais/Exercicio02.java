package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int number = sc.nextInt();

        if( number % 2 == 0){
            System.out.printf(" O numero %d é PAR", number);
        } else {
            System.out.printf("o numero %d é IMPAR ",number);
        }

        sc.close();
    }
}
