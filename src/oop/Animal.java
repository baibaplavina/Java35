package oop;

public class Animal {
    //Field
    private String type;
    private int avgLifespan;
    private double weight;

    //Create custom constructor - no return function; Include all Animal fields = input arguments
    public Animal (String type, int avgLifespan, double weight) {
      this.type = type;
      this.avgLifespan = avgLifespan;
      this.weight = weight;
    }

    //There can be more than 1 constructor in one Class; Different number, Different type need be between constructors
public Animal(String type, int avgLifespan){
        this.type = type;
        this.avgLifespan = avgLifespan;
}

public Animal(){

    }
    public void printAnimalInfo (){
        System.out.println("Type: " + type);
        System.out.println("Avarage livefspan :" + avgLifespan);
        System.out.println("Weight: " + weight);

    }

}
