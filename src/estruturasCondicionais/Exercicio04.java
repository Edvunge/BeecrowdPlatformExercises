package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println(" Ler hora inicial: ");
        int hourStarted = sc.nextInt();

        System.out.println(" Ler hora final: ");
        int hourFinished = sc.nextInt();

        int hourGame;
        if (hourStarted < hourFinished) {
            hourGame = hourStarted - hourFinished;
        }
        else {
            hourGame = 24 - hourFinished + hourStarted;
        }

        System.out.println("O JOGO DUROU " + hourGame + " HORA(S)");

        sc.close();
    }
}