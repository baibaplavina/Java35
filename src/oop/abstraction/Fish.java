package oop.abstraction;

public class Fish extends Pet{
  //There is no default constructor available in 'oop.abstraction.Pet'
    //constractor is not inheritade

    //Custum fish constructor
public Fish (String color, String eat, String place, int averageAge, int waterChangesInWeek){
    //Aizstrāj this.un attiecīgos ierakstus Pet failā.
    super(color, eat, place, averageAge);
    this.waterChangesInWeek = waterChangesInWeek;

}

    //Additional -specefic field for Fish
    private int waterChangesInWeek;



    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eat: " + eat);
        System.out.println("Place " + place);
        System.out.println("Lifespan: " + avarageAge);
        System.out.println("Water changes in a week " + waterChangesInWeek);
    }
}
