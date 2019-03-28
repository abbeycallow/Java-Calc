package com.company;
import java.util.Scanner;

public class  CalcClass {
    double num1;
    double num2;
    double num3;

    public void showMenu() {

        String user;
        System.out.println("Welcome to your calculator.");
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter 3 numbers: ");

        num1 = reader.nextInt();
        num2 = reader.nextInt();
        num3 = reader.nextInt();

        do {
            System.out.println("Enter an operator:");

            System.out.println(" + ");

            System.out.println(" - ");

            System.out.println(" * ");

            System.out.println(" /  ");

            System.out.println("Press & to start over. ");

            System.out.println("Press # to exit calculator.");

            System.out.println();


            Scanner scanner = new Scanner(System.in);

            user = scanner.nextLine();

            switch (user.toString()) {

                case "+":
                    add();

                    break;

                case "-":
                    sub();

                    break;

                case "*":
                    mult();
                    break;

                case "/":
                    div();
                    break;

                case "&":
                    startOver();

                case "#":
                    break;
            }

        } while (!user.equals("#"));

    }

    public void add() {
        double total = num1 + num2 + num3;
        System.out.println("Your answer is " + total);
    }

    public void sub() {
        double total = num1 - num2 - num3;
        System.out.println("Your answer is " + total);
    }

    public void mult() {
        double total = num1 * num2 * num3;
        System.out.println("Your answer is " + total);
    }

    public void div() {
        double total = num1 / num2 / num3;
        System.out.println("your answer is " + total);
    }

    public void startOver() {
        showMenu();
    }
}



