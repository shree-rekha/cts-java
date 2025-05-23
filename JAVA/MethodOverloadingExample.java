package JAVA;
public class MethodOverloadingExample {

    // Method 1: Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Calling the overloaded add methods
        int sum1 = add(5, 10);             // Two integers
        double sum2 = add(3.5, 2.8);       // Two doubles
        int sum3 = add(1, 2, 3);           // Three integers

        // Display the results
        System.out.println("Sum of two integers (5 + 10): " + sum1);
        System.out.println("Sum of two doubles (3.5 + 2.8): " + sum2);
        System.out.println("Sum of three integers (1 + 2 + 3): " + sum3);
    }
}
 
    
