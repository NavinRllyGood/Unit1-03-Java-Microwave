import java.util.Scanner;

/**
* Java program to demonstrate working Microwave in Java.
*
* @author Navin
* @version 1.0
* @since 2023-02-14
*/

public final class Microwave {
    /**
    * Main lines of code.
    *
    *
    * @exception IllegalStateException Utility Class
    * @see IllegalStateException
    */
    private Microwave() {
        throw new IllegalStateException("Utility Class");
    }

    /**
    * Main lines of code.
    *
    *
    * @param args placeholder
    */
    public static void main(final String[] args) {
        // variables
        String stringInput = "";
        int food = 0;
        double number = 0;
        double time = 0;

        try {
            // Get input
            System.out.println("What are you trying to heat up?");
            System.out.println("Enter 1 for pizza, 2 for sub and 3 for soup: ");
            final Scanner line = new Scanner(System.in);
            stringInput = line.nextLine();
            food = Integer.parseInt(stringInput);

            // Get The amount of Items
            System.out.println("How many items would you like to heat up?");
            System.out.println("(Enter a number between 1 and 3.): ");
            final Scanner newLine = new Scanner(System.in);
            stringInput = line.nextLine();
            number = Integer.parseInt(stringInput);
            // Check if number of Items are valid
            if (number < 1 || number > 3) {
                System.out.println("Invalid number of items.");
                // End the program
                System.exit(0);
            } else if (food == 1) {
                // Math
                time = 45 * (1 + (number - 1) / 2);
            } else if (food == 2) {
                time = 60 * (1 + (number - 1) / 2);
            } else if (food == 3) {
                time = 105 * (1 + (number - 1) / 2);
            } else {
                // For incorrect input of the food
                System.out.println("Invalid food Input.");
                // End program
                System.exit(0);
            }
            // Print the result
            // Print time in seconds
            System.out.println("The need time is " + time + " seconds.");
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid mass. "
                + error.getMessage());
        }
    }
}
