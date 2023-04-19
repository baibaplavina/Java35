package tasks.maximumDistance;

public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float passengersInfluence(float fuelUsage, int passengers) {
        float passengersInfluence = fuelUsage + fuelUsage* 0.05f * passengers;
        return passengersInfluence;
    }

    public float maxDistance(float fuel, float fuelUsage, float passengersInfluence, int passengers) {
      float maxDistance;
        if (passengers >= 1) {
            maxDistance = (fuel / passengersInfluence*100);
           } else {
            maxDistance = (fuel / fuelUsage*100);
        }
        return maxDistance;
    }
  }
