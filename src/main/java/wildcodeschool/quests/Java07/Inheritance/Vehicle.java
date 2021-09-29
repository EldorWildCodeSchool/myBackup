package wildcodeschool.quests.Java07.Inheritance;

public abstract class Vehicle {

    //Attributes
    private String brand;
    private int kilometers;

    //Constructor
    public Vehicle(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //Abstract methods
    public abstract String doStuff();

    //Getter- and setter-methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
