package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("digite um numero");
        //int number = sc.nextInt();
        int contador = sc.nextInt();


        System.out.println("digite um numero");
        int userTxt = sc.nextInt();

        do {
            System.out.println(  contador );
            contador -= 1;
        } while( contador >= userTxt );

        /*
        for( contador = number; contador >= 0; contador -= 1 ){
            System.out.println( contador );
        }*/
        System.out.println("ACABOU !!!!");
       // System.out.println("numero digitado: " + number);

        sc.close();
        /*


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double SalarioMinimo = 788.00f;
        double counter;

        System.out.println("indique o seu salario:?");
        double SalaryUser = sc.nextDouble();


//double SalaryAmount = SalaryUser - SalarioMinimo;

        for(counter = SalaryUser; counter == SalarioMinimo; counter -= 1 ) {
            System.out.println( counter );
        }

// System.out.println(" os salários mínimos são: " + SalaryAmount);

        */




/*-------------------------------------------*/

        /*
       int contador;

        for( contador = 5; contador >= 0; contador -= 1 ){
            System.out.println( contador );
        }

        System.out.println("ACABOU !!!!");

        */

    }


    /* int n =1 , i;

        n = leia.nextInt();

        for (i = 1; i <= n ; i++ ) {

            System.out.println(i);

        }*/
}
