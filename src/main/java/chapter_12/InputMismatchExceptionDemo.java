package chapter_12;
import java.util.*;

public class InputMismatchExceptionDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
    //do {
      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The number entered is " + number);
        continueInput = false;
      }
      catch (InputMismatchException ex) {
        //System.out.println("Try again. (Incorrect input: an integer is required)");
        //throw new ArithmeticException("You mother fucker");
        //input.nextLine(); // discard input
      }
      finally {
        System.out.println("What's up Loagang");
      }
    //} while (continueInput);
  }
}
