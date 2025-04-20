package Task_2;

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