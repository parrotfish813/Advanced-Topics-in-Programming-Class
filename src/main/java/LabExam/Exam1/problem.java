import java.util.Scanner;
public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num = input.nextInt();

        checkDivision6and5(num);

    }

    public static void checkDivision6and5(int num) {
        boolean andTrue = false, orTrue = false, orTrueNB = false;

        //Checks if the entered number is divisible by 5 and 6 and setting the corisponding boolean value to true or false
        if(num % 6 == 0) {
            if(num % 5 == 0) {
                andTrue = true;
            }
        }

        //Checks if the entered number is divisible by 5 or 6 and setting the corisponding boolean value to true or false
        if(num % 6 == 0 || num % 5 == 0) {
            orTrue = true;
        }

        //Checks if the entered number is divisible by 5 or 6 but not both and setting the corisponding boolean value to true or false
        if(num % 6 == 0 ^ num % 5 == 0) {
            orTrueNB = true;
        }

        System.out.println("Is " + num + " divisible by 5 and 6? " + andTrue);
        System.out.println("Is " + num + " divisible by 5 or 6? " + orTrue);
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + orTrueNB);
    }
}
