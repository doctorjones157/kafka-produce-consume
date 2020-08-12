package com.algorithms;

/**
 * Recursion -> the method call itself
 * It use the stack (LIFO) for the method execution
 * Recursion doesn't return the result until get the result of the lat method
 *
 * In the below works factorial work like, finding the factorial for 5
 * 5*factorial(4)
 * 4*factorial(3)
 * 3*factorial(2)
 * 2*factorial(1) (Last in) so, first factorial(1) returns 1 so the result is (2*1 = 2)
 * 3*2 (last result -> factorial(2))
 * 4*6 (last result -> factorial(3))
 * 5*24 (last result -> factorial(4))
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        if(num<=1)
            return num;
        else {
            System.out.println("num = " + num);
            return num * factorial(num - 1);
        }
    }
}
//2*f(1)
//3*f(2)
//4*f(3)
//5*f(4)



