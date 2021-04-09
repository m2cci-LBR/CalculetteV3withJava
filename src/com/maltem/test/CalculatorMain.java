package com.maltem.test;

import java.util.Scanner;

public class CalculatorMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Subject subject = new Subject();
        new AddOperation(subject);

            System.out.println("Saisir un premier nombre");
            int number1 = scanner.nextInt();
            System.out.println("Saisir un deuxième nombre");
            int number2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Saisir l'operateur");
            char op = scanner.nextLine().charAt(0);
            subject.setState(number1, number2, String.valueOf(op));
    }

}
