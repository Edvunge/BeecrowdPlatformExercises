import java.util.Locale;
import java.util.Scanner;

public class Exercise1005 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcinaryNumber = sc.nextInt();
        double hoursWorked = sc.nextDouble();
        double paymentHours = sc.nextDouble();

        double paymentSalary = hoursWorked * paymentHours ;

        System.out.printf("paymentSalary = %.2f%n" , paymentSalary);
        System.out.println("funcinaryNumber = " + funcinaryNumber);

        sc.close();
    }
}
