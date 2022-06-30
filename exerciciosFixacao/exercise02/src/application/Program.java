package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee x;
        x = new Employee();


        System.out.print("NAME: ");
        x.name = sc.nextLine();
        System.out.print("Gross salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + x);
        System.out.println();
        System.out.println("Which percentage to increase salary? " );

        double percentage = sc.nextDouble();
        x.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated Data: " + x);





        sc.close();
    }
}
