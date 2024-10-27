package Solution;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculatorTest
{
    /*
    Test 1:
    Test for addition
    */
    @Test
    public void testAddition()
    {
        double result = SimpleCalculator.performOperation(5, 3, '+');
        assertEquals(8, result, 0.0001);  // Check if 5 + 3 equals 8
    }

    /*
    Test 2:
    Test for subtraction
    */
    @Test
    public void testSubtraction()
    {
        double result = SimpleCalculator.performOperation(5, 3, '-');
        assertEquals(2, result, 0.0001);  // Check if 5 - 3 equals 2
    }

    /*
    Test 3:
    Test for multiplication
    */
    @Test
    public void testMultiplication()
    {
        double result = SimpleCalculator.performOperation(5, 3, '*');
        assertEquals(15, result, 0.0001);  // Check if 5 * 3 equals 15
    }

    /*
    Test 4:
    Test for division
    */
    @Test
    public void testDivision()
    {
        double result = SimpleCalculator.performOperation(10, 2, '/');
        assertEquals(5, result, 0.0001);  // Check if 10 / 2 equals 5
    }

    /*
    Test 5:
    Test for division by zero (should throw ArithmeticException)
    */
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero()
    {
        // NOTE: This test expects an ArithmeticException to be thrown
        SimpleCalculator.performOperation(10, 0, '/');
    }

    /*
    Test 6:
    Test for invalid operator (should throw IllegalArgumentException)
    */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator()
    {
        // NOTE: This test expects an IllegalArgumentException for invalid operator
        SimpleCalculator.performOperation(5, 3, '%');  // '%' is not a valid operator
    }

    /*
    Test 7:
    Test for very large numbers (checking overflow or boundary issues)
    */
    @Test
    public void testLargeNumbers()
    {
        double result = SimpleCalculator.performOperation(1e9, 1e9, '+');
        assertEquals(2e9, result, 0.0001);  // Check if large numbers are handled correctly
    }

    /*
    Test 8:
    Test for negative numbers
    */
    @Test
    public void testNegativeNumbers()
    {
        double result = SimpleCalculator.performOperation(-5, -3, '+');
        assertEquals(-8, result, 0.0001);  // Check if negative numbers are handled correctly
    }
}
