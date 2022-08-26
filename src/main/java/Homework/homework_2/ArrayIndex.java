import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {

    public static void main(String[] args) {
        //Declaring scanner and random
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //Declaring empty integer array
        int[] arr = new int[100];

        //Filling array with random integers
        for(int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(100);
        }

        //Creating try catch block
        try {
            //Prompting and allowing user to enter index
            System.out.print("Enter an index: ");
            int index = input.nextInt();

            //Printing out element at given index
            System.out.println("Element at index " + index + " is " + arr[index]);
        }
        catch (Exception ex) {
            //Using exception handling to print if the index is out of bounds
            System.out.println("Out of Bounds");
        }
    }
}

