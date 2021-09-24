package wildcodeschool.quests.Java06.Object_Oriented_Programming;

public class Wilder {

    private String firstname;
    private boolean present;

    public Wilder(String firstname, boolean present){
        this.firstname = firstname;
        this.present = present;
    }

    public String whoAmI() {
        //Vorschlag von Alex mit ternärem Operator
        //Funktioniert so schön kurz, weil auf ein boolean ("present") geprüft wird
        return "I am " + (this.present ? "present" : "not present");

        /*Meine Lösung
        String result = "My name is " + this.firstname + " and I am present.";
        if (this.present == false) {
            result = "My name is " + this.firstname + " and I am not present.";
        }
        return result;
        */
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
