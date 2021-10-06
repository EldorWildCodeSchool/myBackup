package wildcodeschool.dojos.dojo_20211005;

import java.util.Date;

public abstract class Kunde {

    private final String id;
    private String name;
    private String email;
    private Date geburtstag;
    private Date leztzterKauf;

    //Constructor
    public Kunde(String id, String name, String email, Date geburtstag, Date leztzterKauf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.geburtstag = geburtstag;
        this.leztzterKauf = leztzterKauf;
    }

    // Abstract method
    // Calculates and returns the discount depending on the type of Kunde
    public abstract double berechneRabatt(int wert);

    //Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public Date getLeztzterKauf() {
        return leztzterKauf;
    }

    public void setLeztzterKauf(Date leztzterKauf) {
        this.leztzterKauf = leztzterKauf;
    }
}
