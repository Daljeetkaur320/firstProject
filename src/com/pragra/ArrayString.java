package com.pragra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayString {
    // look like array series of boxes and all connected , it made up of []
    public static void main(String[] args) {
        // int marks1 = 10;   // simple int bucket
        // int marks2 = 10;
        // int marks3 = 10;
        //  int marks4 = 10;
        //  int marks5 = 10;

        // int[] arr = new int[100];  // create an array object
        // arr[0] = 10;   // array starts 0 and assign with 1st box
        //arr[1] = 10;
        // arr[2] = 10;
        // arr[3] = 10;
        // arr[4] = 10;
        //Scanner sc = new Scanner(System.in);
        //int[] arr = new int[5];
        //  for(int i =0; i<=4; i++){  // 4 is because of 0 to 4 that means 5 data
        // arr[i] =10;
        // System.out.println("enter marks");
        // arr[i] = sc.nextInt();

        //}
        // System.out.println(Arrays.toString(arr));


        // System.out.println(marks1);
        //System.out.println(marks2);
        //System.out.println(marks3);
        // System.out.println(marks4);
        // System.out.println(marks5);

       //int y = 10;



                Scanner sc = new Scanner(System.in);
                int[] marks = new int[5];
                for(int i = 0; i < marks.length; i++){
                    System.out.print("Enter marks:: ");
                    marks[i] = sc.nextInt();
                }
                int total = sum(marks);
                System.out.println("Total marks:: " +total);
            }

            public static int sum(int[] marks){
                int total = 0;
                for (int i : marks){
                    total = total + i;
                }
                return total;
            }
        }







