# Calculator
This code represents the concept of a simple virtual calculator. Essentially, it defines a class that acts as a model in the MVC (Model-View-Controller) programming pattern.
The class allows basic operations, such as adding positive numbers, resetting the value, and handling exceptions when attempting to add negative numbers.

```
package Task_1;

// Calculator class that acts as a model in the MVC pattern
public class calculator {
    private int currentValue;

    // Constructor that initializes the value to zero
    public calculator() {
        this.currentValue = 0;
    }

    // Method to reset the calculator to zero
    public void reset() {
        this.currentValue = 0;
    }

    // Method to add a positive integer
    public void add(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers cannot be added.");
        }
        this.currentValue += number;
    }

    // Method to get the current value of the calculator
    public int getCurrentValue() {
        return this.currentValue;
    }

    // Temporary main method to test the Calculator class
    public static void main(String[] args) {
        calculator calculator = new calculator();

        try {
            calculator.add(10); // Add 10
            calculator.add(20); // Add 20
            System.out.println("Current value: " + calculator.getCurrentValue()); // Prints 30

            calculator.add(-5); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        calculator.reset(); // Reset to zero
        System.out.println("Value after reset: " + calculator.getCurrentValue()); // Prints 0
    }
} 
```
# Functions of the Class

- **Constructor**: Initializes the calculator's current value to zero.
- **reset()**: Resets the current value to zero.
- **add(int number)**: Adds a positive integer to the current value. Throws an exception if a negative number is provided.
- **getCurrentValue()**: Returns the current value of the calculator.
- **main(String[] args)**: A temporary main method to test the functionality of the calculator class. It demonstrates adding numbers, handling exceptions, and resetting the calculator.
- **Exception Handling**: The class uses `IllegalArgumentException` to handle cases where a negative number is attempted to be added, ensuring that the calculator only accepts valid inputs.
- **Output**: The main method prints the current value after adding numbers, handles exceptions, and shows the value after resetting the calculator.
- **MVC Pattern**: The calculator class serves as the model in the MVC pattern, where the view and controller would be responsible for user interaction and displaying results, respectively.
- **Testing**: The main method serves as a simple test case for the calculator class, demonstrating its functionality and exception handling.
- **Usage**: This class can be used as a foundation for building a more complex calculator application, where additional features and functionalities can be added as needed.
- **Future Improvements**: The calculator class can be extended to include more operations (subtraction, multiplication, division), support for floating-point numbers, and a user interface for better interaction.
- **Documentation**: The code is well-commented, providing a clear understanding of each method's purpose and functionality.
- **Code Quality**: The code follows standard Java conventions, making it easy to read and maintain. The use of exception handling ensures robustness and reliability in handling invalid inputs.
- **Best Practices**: The class adheres to best practices in object-oriented programming, encapsulating the calculator's state and behavior within a single class. It also demonstrates the importance of input validation and error handling in software development.
- **Conclusion**: The calculator class serves as a simple yet effective example of how to implement a basic calculator using object-oriented programming principles. It provides a solid foundation for further development and enhancement, making it a valuable resource for learning and experimentation in Java programming.
- **References**: The code is inspired by the principles of the MVC pattern and best practices in Java programming. It serves as a practical example for beginners and intermediate programmers looking to understand the concepts of object-oriented design and exception handling in Java.
- 

