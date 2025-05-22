// Define the Car class
public class Car {
    // Attributes (fields)
    String make;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("------------------------");
    }

    // Main method to create objects and use the class
    public static void main(String[] args) {
        // Create first Car object
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        // Create second Car object
        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2022;

        // Call the method to display details
        car1.displayDetails();
        car2.displayDetails();
    }
}
