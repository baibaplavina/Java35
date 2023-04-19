/*
package tasks.maximumDistanceAC;

import java.util.Scanner;

public class VehicleCallingAC {


        private static Scanner scanner = new Scanner(System.in);
        private VehicleAc vehicle;

        public VehicleCallingAC(VehicleAc vehicle) {
            this.vehicle = vehicle;
        }

        public static void main(String[] args) {

            System.out.println("Enter fuel amount in your vehicle");
            float fuel = scanner.nextFloat();

            System.out.println("Enter your car fuel usage for 100 km");
            float fuelUsage = scanner.nextFloat();

            System.out.println("Enter how many passengers will be in vehicle");
            int passengers = scanner.nextInt();

            System.out.println("Will you turn on air conditioner? y/n ");
            boolean airCondition = scanner.hasNext();


            VehicleAc vehicle = new VehicleAc(fuel, fuelUsage, passengers);
            System.out.println("New fuel usage with passengers for 100 km: " + vehicle.newFuelUsagePassengersInfluence( fuelUsage, passengers));
            System.out.printf("Your vehicle can drive maximum of %.2f kilometers", vehicle.maxDistance(fuel, fuelUsage, vehicle.newFuelUsagePassengersInfluence(fuelUsage, passengers),passengers) );

        }
    }
*/
