package oop.abstraction;

public abstract class Pet {
    protected String color;
    protected String eat;
    protected String place;
    protected int avarageAge;

    //Create Contructor for replace setter/getter methods
    public Pet(String color, String eat, String place, int averageAge){
        this.color=color;
        this.eat = eat;
        this.place= place;
        this.avarageAge=averageAge;
    }

    //Abstract method - sets rule for subclass.
    public abstract void printPetInfo();
}
