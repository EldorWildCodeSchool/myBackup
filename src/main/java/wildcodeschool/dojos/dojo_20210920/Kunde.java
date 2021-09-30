package wildcodeschool.dojos.dojo_20210920;

public abstract class Kunde {

    //Class attributes
    private String id;
    private String name;
    private String email;

    //Constructor
    public Kunde(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //Class method
    public abstract double berechneRabatt(int wert);

    //Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
