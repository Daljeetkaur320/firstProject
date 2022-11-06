package com.pragra;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for(int i = 1; i<= 10; i++) {
        // if(i%3 == 0) {
        //   System.out.println(i);
        //}
        //}

        //int thoughtNo = (int) (Math.random() * 10);
       // System.out.println("lets play the guessing game ");
       // System.out.println("I have thought a number .. You try guessing it");
        // Scanner sc = new Scanner(System.in);
        // int guessedNo = sc.nextInt(); //i = 1
        // while (true) { // we use true so thats why it was comes with break
       // while (thoughtNo!= guessedNo){  // while (10 >=1)
         //   System.out.println("your guess was wrong ... try again");
           //  guessedNo = sc.nextInt(); //i++
        //}
            // if () {
               //  System.out.println("your right ... you win");
                // break;
           // } else {
             //   System.out.println("your were wrong .. trying guessing again");
          //  }
        // System.out.println("you win, guessed right");

        int thoughtNo = (int)(Math.random()*10);
        System.out.println("lets play the game ");
        System.out.println("i have thought a number .. you try guessing it");
        Scanner sc = new Scanner(System.in);
        int guessedNo;
        do {
            System.out.println("Guess your number...keep searching");
             guessedNo = sc.nextInt();
        } while (thoughtNo!=guessedNo);
        System.out.println("you win , guessed right ");
        System.out.println("This is vivek");
        }

    }


