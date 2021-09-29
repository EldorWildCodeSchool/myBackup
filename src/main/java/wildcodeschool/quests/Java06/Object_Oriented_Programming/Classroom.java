package wildcodeschool.quests.Java06.Object_Oriented_Programming;

public class Classroom {

    public static void main(String[] args) {

        //Initialization of an array of type Wilder with the attributes of my classmates
        Wilder[] wildersArr = new Wilder[12];
            wildersArr[0] = new Wilder("Arman", true);
            wildersArr[1] = new Wilder("Corinna", false);
            wildersArr[2] = new Wilder("Eldor", true);
            wildersArr[3] = new Wilder("Marco", false);
            wildersArr[4] = new Wilder("Michael", false);
            wildersArr[5] = new Wilder("Anonymous 43336", true);
            wildersArr[6] = new Wilder("Christiane", false);
            wildersArr[7] = new Wilder("David", false);
            wildersArr[8] = new Wilder("Leander", false);
            wildersArr[9] = new Wilder("Martin", true);
            wildersArr[10] = new Wilder("Reinhard", false);
            wildersArr[11] = new Wilder("Alex", true);

        // Iterating with "for each"-loop through the array to get (print to console) the attributes of my classmates
        for(Wilder classmates : wildersArr){
            System.out.println(classmates.whoAmI());
        }
    }
}
