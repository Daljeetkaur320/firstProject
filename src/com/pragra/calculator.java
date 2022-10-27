package com.pragra;

import static com.sun.javafx.fxml.expression.Expression.multiply;
import static java.lang.Integer.sum;

public class calculator {
    public static void main(String[] args) {



        int sumResult = sum(9, 2);
        int diffResult = difference(9, 5);
        int multiplyResult = multiply(6, 4);
        double divideResult = divide(5, 3);




        System.out.println("The sum:" + sumResult);
        System.out.println("The difference:" + diffResult);
        System.out.println(" The multiply:" + multiplyResult);
        System.out.println(" The divide:" + divideResult);

    }
        public static int sum(int x, int y){

        return x + y ;
        }

    public static int difference(int y, int x){
        return y-x;

    }

    public static int multiply(int x, int y) {

        return x * y;
    }

    public static double divide(double x, double y) {
        return x/y;

    }





    }
