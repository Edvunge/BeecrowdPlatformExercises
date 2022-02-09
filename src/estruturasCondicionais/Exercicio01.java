package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio01 {
    // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int number = sc.nextInt();



        if( number > 0 ){
            System.out.printf("O É número %d POSITIVO", number);
        }else if(number == 0 ){
            System.out.printf("O É número %d NULO", number);
        } else {
            System.out.printf("O É número %d NEGATIVO", number);
        }

        sc.close();
    }
}
