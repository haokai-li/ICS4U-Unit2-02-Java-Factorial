/*
* The "Factorial Algorithm" program, just proves you can show print to terminal.
*
* @author  Haokai
*
* @version 1.0
*
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "Factorial Algorithm" program.
*/
final class Factorial {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting calculate function.
    *
    * @param originalNumber
    *
    * @return calculate
    */

    static int calculate(final int originalNumber) {
        final int answer;
        if (originalNumber == 1) {
            answer = 1;
        } else {
            answer = originalNumber * calculate(originalNumber - 1);
        }
        return answer;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        try {
            // input
            final Scanner input = new Scanner(System.in);
            System.out.print("The original integer is : ");
            final int originalNumber = input.nextInt();

            final int sum = calculate(originalNumber);

            System.out.println(
                "The answer of Factorial Algorithm (using recursion) is : "
                + sum);

        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something was not a number.");
        }
        System.out.println("\nDone.");
    }
}
