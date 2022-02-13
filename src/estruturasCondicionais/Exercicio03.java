package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int numberOne = sc.nextInt();

        System.out.println("digite um segundo numero");
        int numberTwo = sc.nextInt();


        if( numberOne % 2 == 0 && numberTwo % 2 == 0){
            System.out.printf("O %d e o %d SÃO MULTIPLOS",numberOne, numberTwo );
        } else {
            System.out.printf("O %d e o %d NÃO SÃO MULTIPLOS",numberOne, numberTwo );
        }

        sc.close();

    }
}
