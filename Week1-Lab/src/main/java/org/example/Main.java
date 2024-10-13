package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taskOne();
        //taskTwo();
        //taskThree();
        //taskFour();
        //taskFive();
        taskSix();
    }
    public static void taskOne(){
        //1. Create a program that prints your name to the screen.
        String yourName = "Katarina";

        System.out.println("My name is " + yourName);
    }
    public static void taskTwo(){

        System.out.println("Hello world!\n (And all the other people of the world)");
    }
    public static void taskThree(){
        //3. Create a program that counts and displays how many seconds there are in a year.
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int secondsInYear = days*hours*minutes*seconds;

        System.out.println("There are "+ secondsInYear + " second in 365 days.");

    }
    public static void taskFour(){
        int numOne, numTwo, sum;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        numOne = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        numTwo = Integer.parseInt(reader.nextLine());
        sum = numOne + numTwo;
        System.out.println("The sum is: " + sum);
    }
    public static void taskFive(){
        int someNumber;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number: ");
        someNumber = Integer.parseInt(reader.nextLine());
        if(someNumber > 0){
            System.out.println("Number is positive.");

        } else if (someNumber>0) {
            System.out.println("Number is negative.");

        }else{
            System.out.println("Number is zero.");
        }
    }
    public static void taskSix(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        if(secondNum > firstNum) {
            System.out.println(secondNum + " is bigger than " + firstNum + ".");
        } else if (secondNum < firstNum) {
            System.out.println(firstNum + " is bigger than " + secondNum + ".");

        }else{
            System.out.println("They are equal.");
        }
    }
}