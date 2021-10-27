package wildcodeschool.project.chuckbot.week2;

import java.time.LocalDate;

public class Joke {

    // Object variables
    private String joke;
    private LocalDate dateCreated;

    // Constructor
    public Joke(String joke, LocalDate dateCreated) {
        this.joke = joke;
        this.dateCreated = dateCreated;
    }


    public String serializedCSV(){
        return (this.joke + ";" + this.dateCreated + System.lineSeparator());
    }

    //Getter and setters
    public String getJoke() {
    return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

}

