package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return 2 * number;
    }

    // create a new method called add(). This method should be private, static, and should have a return type of int. The method should take one parameter as its input. The parameter name should be numbers, and should be of type int[]. At this time, return -1 as the return value of the method.
    // For the implementation of add() method, replace return -1; from the last task with the following. Create a variable called sum, and initialize its value to 0. Then, using a for loop over numbers (or using a while loop), add every item in the numbers array to the sum variable. Finally, return sum.
    private static int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // Create a new public class BestLoanRates (in a file called BestLoanRates.java located under the com.h2 package and directory). At this time, the class implementation should be empty.
    
}
