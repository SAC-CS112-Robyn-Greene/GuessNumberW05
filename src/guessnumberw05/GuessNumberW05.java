/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumberw05;


import java.util.*;

/**
 *
 * @author Robyn
 */
public class GuessNumberW05{

    //main method
    //Generate scanner and random number
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //do integers
        int guess = 0;
        int number = rand.nextInt(10) + 1;
        String reply = ("y");
        int guessCount = 0;
        /*start an infinite loop
        //start game
        //do an if statement
         */
        while (true) {
            System.out.print("Guess a number ");
            guess = input.nextInt();
            guessCount++;
            if (guess < number) {
                System.out.println("You are too low.");
            } else if (guess > number) {
                System.out.println("You are too high.");
            } else if (guess == number) {
                System.out.println("You have won!!!");
                System.out.println("You got it right in " + guessCount + " guesses!");
            } else {
                return;
            }
            //do a second if else statement
            System.out.printf("%s%n%s%n", "Would you like to play again?", "yes/no");
            reply = input.next();
            if (reply.equalsIgnoreCase("y")) {
            } else {
                System.out.println("Goodbye!");
                break;
            } //it works :)
            /*try to calculate how many good guesses
            *try to calculate how many bad guesses
            *keep track of number of games played
            *calculate percentage overall
             */
        }//while     

    }//end main

}//end class
