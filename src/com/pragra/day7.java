package com.pragra;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        //for(int i=1; i<=5; i++) {

        //  for(int j =1; j<=i; j++)
        //    System.out.print(i+ " ");
        // System.out.println();
        //}
        // int counter = 0;
        //while(counter <=10){
        //System.out.println("hello");
        //   counter++;
        //}
        //
        // int thoughtNo = (int) (Math.random()*10);
        // System.out.println("Let's play the game");
        // System.out.println(" lets guessing the number then your are the winner");
        //Scanner sc = new Scanner(System.in);
        // int guessNo = sc.nextInt();
        // while (thoughtNo!=guessNo) {
        //   System.out.println("your guss is right ");
        // guessNo = sc.nextInt();
        //}

        int guess = (int) (Math.random() * 100);
        System.out.println("lets play the run");
        System.out.println("choose the number");
        Scanner sc = new Scanner(System.in);
        int chooseNo = sc.nextInt();
        while (chooseNo == guess) {
            System.out.println("this is right ");
            break;
        }


    }


}


