package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // program to calculate temperature

        int answer = 87;

        int guess = 0;

        Scanner sc = new Scanner(System.in);

        while (guess != answer) {

            System.out.println("Guess the temperature (1-100): ");
            guess = sc.nextInt();

            int test = Math.abs(guess - answer);

            if (test < 10) {
                System.out.println("Hot");
            } else if (test < 20) {
                System.out.println("Warmer");
            } else if (test < 30) {
                System.out.println("Warm");
            } else {
                System.out.println("Cold");
            }
        }
        System.out.println("Good guess! That was corrent the number is " + answer);
    }
}