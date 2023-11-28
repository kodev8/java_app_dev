package ex2;

import java.util.Scanner;

abstract class Vehicle {

    void printInfo() {
        System.out.println("Vehicle Details: ");
    }

    abstract void vehicleInfo();
}


class Car extends Vehicle {

    @Override
    public void vehicleInfo() {
        
        Scanner scanner = new Scanner(System.in);

        // Enter car brand: Audi
        // Enter car model: Audi A5 Mk1
        // Enter car price: 15000€
        // Car availability: Yes

        // get the car brand
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        
        // get the car model
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        // get the car price
        System.out.print("Enter car price: ");
        double price = scanner.nextInt();

        // get the car availaility
        System.out.print("Car availability: ");
        String available = scanner.next();

        // close the scanner and print an empty line
        scanner.close();
        System.out.println();

        // use the parent class method to print the vehicle details intro 
        super.printInfo();

        // print the car details obtained from the previous steps
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car price: $" + price);
        System.out.println("Car availability: " + available);

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleInfo();
    }

   
}


