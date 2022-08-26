//Brandon Townes
// Assignment #1 Problem #2
// Last debug and run: 1/28/2022

public class Alligator {
    //Creating variables
    private double weight;
    private int num_leg;
    private double age;

    // Default Constructor
    Alligator() {
    }

    //User Defined Constructor
    Alligator(double weight, int num_leg, double age) {
        this.weight = weight;
        this.num_leg = num_leg;
        this.age = age;
    }

    //Printing out the data from the objects
    void toPrint() {
        System.out.println("Current alligators info: ");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Number of legs: " + num_leg + " legs");
        System.out.println("Age: " + age + " yrs");
    }

    //Printing out swim info
    void swim() {
        System.out.println("The alligator can swim really fast!");
    }

    //Set Weight Function
    void setWeight(double weight){
        this.weight = weight;
    }

    //Set Num_leg Function
    void setNum_leg(int num_leg){
        this.num_leg = num_leg;
    }

    //Set Age Function
    void setAge(double age){
        this.age = age;
    }
}
