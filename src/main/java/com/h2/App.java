package com.h2;

/**
 * Hello world!
 *Modify doubleTheNumber()

Before you continue to make progress on this project, it is a good idea to start adding a few changes to an existing file.

Open App.java, which is located in the src/main/java/com/h2 directory. In App.java, you will find a method called doubleTheNumber(). Currently, it returns -1 as the return value. Change this implementation so that it returns two times the number parameter.

2
Create a New add() Method

Next, create a new method called add(). This method should be private, static, and should have a return type of int. The method should take one parameter as its input. The parameter name should be numbers, and should be of type int[]. At this time, return -1 as the return value of the method.

3
Add Implementation to add() Method

For the implementation of add() method, replace return -1; from the last task with the following. Create a variable called sum, and initialize its value to 0. Then, using a for loop over numbers (or using a while loop), add every item in the numbers array to the sum variable. Finally, return sum.

4
Create a New BestLoanRates Class

Create a new public class BestLoanRates (in a file called BestLoanRates.java located under the com.h2 package and directory). At this time, the class implementation should be empty. Make sure that it is located under the right package. You would know that your implementation is correct if the first line of BestLoanRates.java is package com.h2;.

5
Create a new main() method

Inside BestLoanRates.java, add a new method called main(). This method must be public, static, void (which means it returns nothing). The method must also takes one parameter. The parameter type must be String[], and its name should be args. At this time, leave the body of the main() method empty.

6
Get the User Name Using Scanner API

In the main() method, create a new variable called scanner of type Scanner. Initialize this variable by calling the Scanner constructor (new Scanner(argument goes here)) and providing System.in as its argument (also known as the source of the Scanner). You will need to import java.util.Scanner. You will use the Scanner API to read user-input from the command-line.

Next, print the statement "Enter your name" in the console using System.out.println(). Then, create a new variable called name of type String. Initialize this variable using scanner.nextLine() method. The scanner.nextLine() blocks on the command-line until it receives the input from the user, followed by the user pressing the Enter key. The input that it receives will be set as the value of the name variable.

Print this variable back to the console using System.out.println(). The format of the statement should be "Hello", followed by space, followed by the value of the name variable.

7
Create a New Map bestRates

In order to provide the best rates to users, you need a way to map from the loan year to best rate available.

Inside BestLoanRates.java, create a new variable called bestRates. This variable must be public, static, and final (so that it is immutable once it is created). The type of bestRates must be Map<Integer, Float>. You will need to import java.util.Map to use Map in this step. Initialize this variable using the Map.of() syntax so that the values can be provided right here.

Add 3 key-value pairs. Add 1, 5.50f, 2, 3.45f, 3, 2.67f as the argument to Map.of(). This is a way of saying that for a loan of 1 year, the best rate is 5.50%, for 2 years the best rate is 3.45% and for 3 years the best rate is 2.67%.

8
Create a New Method getRates()

Now, create a new method called getRates(). The purpose of this method is to return the best rate available for the given loan term in years. This method must be public, static, and returns a float. The method takes one parameter called loanTermInYears of type int. For now, return 0.0f.

9
Add an Implementation to getRates()

Replace the return 0.0f with the following logic - if the bestRates variable contains the entry for loanTermInYears variable, return the corresponding value as the return value from this method. You can use containsKey() that is available on Map type. Otherwise, return 0.0f as the return value.

10
Get the Loan Term Using the Scanner API

Navigate to the line in the main() method where you printed "Hello " with the user name. Right after that, print another line using System.out.println() that says "Enter the loan term (in years)". Then, call the nextInt() method on scanner variable. Save the value received into a new variable called loanTermInYears. The type of this variable must be int since scanner.nextInt() returns an int.

Then, call the getRates() method and pass loanTermInYears as the argument. Save the received value into a variable called bestRate. The variable must be of type float since getRates() returns a value of type float.

Now, if the value of bestRate is 0.0f, print "No available rates for term: " + loanTermInYears + " years" (using System.out.println()). Otherwise, print "Best Available Rate: " + getRates(loanTermInYears) + "%". Read more about the float comparisons in java at this Stack Overflow page on comparing floats.

Finally, call the close() method on scanner.
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

    private static int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static class BestLoanRates {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
            System.out.println("Enter the loan term (in years)");
            int loanTermInYears = scanner.nextInt();
            float bestRate = getRates(loanTermInYears);
            if (bestRate == 0.0f) {
                System.out.println("No available rates for term: " + loanTermInYears + " years");
            } else {
                System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
            }
            scanner.close();
        }

        public static Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

        public static float getRates(int loanTermInYears) {
            if (bestRates.containsKey(loanTermInYears)) {
                return bestRates.get(loanTermInYears);
            }
            return 0.0f;
        }
    }

    
}
