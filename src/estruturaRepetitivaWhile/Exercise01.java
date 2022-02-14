package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/
        Scanner ler = new Scanner(System.in);

        System.out.println("indique a sua senha.");
        int password = ler.nextInt();


        while (password != 2002) {
            System.out.println("Acesso Negado");
            password = ler.nextInt();
        }
        System.out.println("Acesso Permitido");

        ler.close();
    }
}
