package tasks.maximumDistance;

import java.util.Scanner;

import static tasks.maximumDistance.Vehicle.*;

public class VehicleCalling {
    private static Scanner scanner = new Scanner(System.in);
    private Vehicle vehicle;

    public VehicleCalling(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static void main(String[] args) {

        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your car fuel usage for 100 km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scanner.nextInt();


        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.println("New fuel usage with passengers for 100 km: " + vehicle.passengersInfluence( fuelUsage, passengers));
       System.out.printf("Your vehicle can drive maximum of %.2f kilometers", vehicle.maxDistance(fuel, fuelUsage, vehicle.passengersInfluence(fuelUsage, passengers),passengers) );

    }
}

