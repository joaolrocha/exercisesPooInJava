package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height:");

        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        double areaX = x.area();
        double perimeterX = x.perimeter();
        double diagonalX = x.diagonal();

        System.out.println();
        System.out.printf("AREA = %.2f%n", x.area());
        System.out.printf("PERIMETER = %.2f%n", x.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", x.diagonal());

        sc.close();
    }
}
