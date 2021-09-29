package wildcodeschool.quests.Java07.Inheritance;

public class Car extends Vehicle {

    //Constructor
    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    //Concrete methods
    @Override
    public String doStuff(){
        return "I am " + this.getBrand() + " and I go brooom brooom brooom!";
    }
}
