package wildcodeschool.quests.Java07.Inheritance;

public class Hangar {

    public static void main(String[] args) {

        //Instantiating two instances, one of type Car and one of type Boat
        Car myTöffTöff = new Car("KOENIGSEGG", 100000);
        Boat myIceBergCrusher = new Boat("Titanic", 5556);

        //Printing the results of the doStuff-method of each instantiated object
        System.out.println(myTöffTöff.doStuff());
        System.out.println(myIceBergCrusher.doStuff());
    }
}
