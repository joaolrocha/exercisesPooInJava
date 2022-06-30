package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stu;
        stu = new Student();

        System.out.println("Insira o nome do estudante: ");
        stu.name = sc.nextLine();
        System.out.println("Nota da primeira avaliacao: ");
        stu.av1 = sc.nextDouble();
        System.out.println("Nota da segunda avaliacao: ");
        stu.av2 = sc.nextDouble();
        System.out.println("Nota da terceira avaliacao: ");
        stu.av3 = sc.nextDouble();

        double notaFinal;
        notaFinal = stu.notaFinal();

        if (notaFinal > 60.0) {
            System.out.println("Nota final do aluno: " + notaFinal + ", Aluno Aprovado!!");
        } else System.out.println("Nota final do aluno: " + notaFinal + ", Aluno reprovado, abaixo da media!");





        sc.close();
    }
}
