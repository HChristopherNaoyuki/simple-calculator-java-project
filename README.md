# Simple Calculator with Exception Handling

## Overview
This project is a simple Java-based calculator that performs basic arithmetic operations: addition, subtraction, multiplication, and division. It includes robust exception handling to manage division by zero and invalid operator inputs. The project also includes unit tests implemented using **JUnit 4** to ensure reliable operation and test coverage.

---

## Features

- **Basic Operations**: Supports addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
- **Exception Handling**:
  - **Division by Zero**: Catches and handles `ArithmeticException` when attempting to divide by zero.
  - **Invalid Operator**: Throws `IllegalArgumentException` when an invalid operator is passed.
- **User Input**: Accepts two numbers and an operator from the user via the console.
- **Unit Tests**: Comprehensive test suite using **JUnit 4**, covering various scenarios such as:
  - Standard operations (addition, subtraction, etc.)
  - Division by zero and invalid operators
  - Handling of large and negative numbers

---

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **JUnit 4** for unit testing
- A code editor or IDE (e.g., **IntelliJ IDEA**, **Eclipse**)

---

### Running the Program

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/HChristopherNaoyuki/simple-calculator-java-project.git
   cd simple-calculator
   ```

2. **Compile and Run the Application**:

   Compile the `SimpleCalculator` class:

   ```bash
   javac Solution/SimpleCalculator.java
   ```

   Run the program:

   ```bash
   java Solution.SimpleCalculator
   ```

   The program will prompt you to enter two numbers and an operator. It will then display the result or an error message if any exceptions are encountered.

---

### Example Usage

```text
Enter the first number: 10
Enter the second number: 2
Enter the operator (+, -, *, /): /
The result is: 5.0
```

```text
Enter the first number: 10
Enter the second number: 0
Enter the operator (+, -, *, /): /
Failed to compute division: Cannot divide by zero.
```

---

## Running Unit Tests

This project includes **JUnit 4** tests for the `SimpleCalculator` class.

To run the tests:

1. Make sure **JUnit 4** is available in your classpath.

2. Compile and run the test cases:

   ```bash
   javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar Solution/SimpleCalculatorTest.java
   java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Solution.SimpleCalculatorTest
   ```

The test suite covers basic operations, division by zero, invalid operators, and edge cases like large numbers.

---

## Project Structure

```text
|-- Solution/
|   |-- SimpleCalculator.java     # Calculator implementation
|   |-- SimpleCalculatorTest.java # JUnit 4 test cases
|-- README.md                     # Project documentation
```

---

## Contributing

Contributions are welcome! If you find any bugs or want to add more features, feel free to open an issue or submit a pull request.

---

## License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.

---
