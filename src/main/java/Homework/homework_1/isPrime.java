// Brandon Townes
// Assignment #1 Problem #1
// Last debug and run: 1/28/2022

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        //Creating scanner
        Scanner input = new Scanner(System.in);

        //Creating variable
        int num;

        //Asking for and accepting user input
        System.out.println("Please enter a number: ");
        num = input.nextInt();

        //Printing out the result
        System.out.println("The sum of all prime numbers from 2 to " + num + " is " + primeSum(num));
    }

    //Creating function to add all the prime numbers in the defined range
   public static int primeSum(int m) {
        int sum = 0;

        for(int i = 2; i < m; i++) {
            //Checking if the number is prime
            if(bePrime(i)) {
                //If prime add it to the sum
                sum = sum + i;
            }
        }

        return sum;
    }

    //Creating function to check if a number is prime
    public static boolean bePrime(int n) {
        boolean isPrime = true;

        //Incrementing through every value in between 2 and the given number
        for(int i = 2; i < n; i++) {
            //Checking if the number is prime
            if(n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}

