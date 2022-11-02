package com.pragra;

public class ArrayString {
    // look like array series of boxes and all connected , it made up of []
    public static void main(String[] args) {
        int marks1 = 10;
        int marks2 = 10;
        int marks3 = 10;
        int marks4 = 10;
        int marks5 = 10;

        int[] arr = new int[100];
        arr[0] = 10;   // array starts 0 and assign with 1st box
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;

        for(int i =0; i<=4; i++){  // 4 is because of 0 to 4 that means 5 data
            arr[i] =10;
        }


        System.out.println(marks1);
        System.out.println(marks2);
        System.out.println(marks3);
        System.out.println(marks4);
        System.out.println(marks5);

    }
}
