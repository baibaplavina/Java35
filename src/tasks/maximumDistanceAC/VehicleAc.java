/*package tasks.maximumDistanceAC;

public class VehicleAc {

        private float fuel;
        private float fuelUsage;
        private int passengers;

        public VehicleAc(float fuel, float fuelUsage, int passengers) {
            this.fuel = fuel;
            this.fuelUsage = fuelUsage;
            this.passengers = passengers;
        }

    public float newFuelUsagePassengersInfluence(float fuelUsage, int passengers) {
            float newFuelUsagePassengersInfluence = fuelUsage + fuelUsage* 0.05f * passengers;
            return newFuelUsagePassengersInfluence;
        }

        public float maxDistance(float fuel, float fuelUsage, float newFuelUsagePassengersInfluence, int passengers) {
            float maxDistance;
            if (passengers >= 1) {
                maxDistance = (fuel / newFuelUsagePassengersInfluence*100);
            } else {
                maxDistance = (fuel / fuelUsage*100);
            }
            return maxDistance;
        }
    }

    class Car extends VehicleAc {
   boolean airConditioner;


        public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
            super(fuel, fuelUsage, passengers);
            this.airConditioner=airConditioner;

        }*/

       /* public void maxDistance ((float fuel, float fuelUsage, float newFuelUsagePassengersInfluence, int passengers, boolean airConditioner) {
            float maxDistance;

            if (passengers >= 1) {
                maxDistance = (fuel / newFuelUsagePassengersInfluence*100);
            }else{
                maxDistance = (fuel / fuelUsage*100);
            }
            return maxDistance;
        }*/
    /*public boolean airconditionOn(char airConditioner) {
        if (airConditioner = 'y') {
            maxDistance = maxDistance*1.1;
            return maxDistance;
            }*/
