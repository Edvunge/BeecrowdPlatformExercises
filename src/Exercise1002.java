import java.util.Scanner;

public class Exercise1002 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        */

        Scanner sc = new Scanner(System.in);

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        int soma = numberOne + numberTwo;

        System.out.println("soma = " + soma);

        sc.close();
    }
}
