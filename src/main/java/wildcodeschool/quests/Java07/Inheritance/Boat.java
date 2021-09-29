package wildcodeschool.quests.Java07.Inheritance;

public class Boat extends Vehicle {

    //Constructor
    public Boat(String brand, int kilometers){
        super(brand, kilometers);
    }

    //Concrete methods
    @Override
    public String doStuff(){
        return "I am " + this.getBrand() + " and I go glug glug glug!";
    }
}
