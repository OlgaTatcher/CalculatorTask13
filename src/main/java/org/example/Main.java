package org.example;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final String MESSAGE_OF_ERRORS="Error: invalid operation ";
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            out.println("Please enter first number");
            double num1=scanner.nextInt();
            out.println("Please enter your operation");
            char operation=scanner.next().charAt(0);
            out.println("Please enter second number");
            double num2= scanner.nextInt();

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        out.println(MESSAGE_OF_ERRORS+":Division by zero!");
                        return;
                    }
                    break;
                default:
                    out.println(MESSAGE_OF_ERRORS);
                    return;
            }

            out.println("Result: " + result);


    }
}