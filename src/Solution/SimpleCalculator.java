// Package Declaration
package Solution;

import java.util.Scanner;

public class SimpleCalculator
{
    // Method to perform arithmetic operations
    public static double performOperation(double num1, double num2, char operator) throws IllegalArgumentException
    {
        // Declare a result variable to store the calculation result
        double result = 0.0;

        // Switch case based on the operator
        switch (operator)
        {
            case '+':
                result = num1 + num2;  // Addition
                break;
            case '-':
                result = num1 - num2;  // Subtraction
                break;
            case '*':
                result = num1 * num2;  // Multiplication
                break;
            case '/':
                // Handling division, ensuring num2 is not zero
                try
                {
                    if (num2 == 0)
                    {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;  // Division
                }
                catch (ArithmeticException e)
                {
                    // Print exception message and rethrow it
                    System.out.println("Error: " + e.getMessage());
                    throw e;
                }
                break;
            default:
                // If the operator is invalid, throw an IllegalArgumentException
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        return result;  // Return the calculated result
    }

    // Main method to execute the calculator logic
    public static void main(String[] args)
    {
        // Create a scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        try
        {
            // Prompt the user to input the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user to input the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt the user to input the operator (+, -, *, /)
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the operation and print the result
            double result = performOperation(num1, num2, operator);
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e)
        {
            // Handle division by zero error
            System.out.println("Failed to compute division: " + e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            // Handle invalid operator input
            System.out.println("Invalid input: " + e.getMessage());
        }
        catch (Exception e)
        {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally
        {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
}
