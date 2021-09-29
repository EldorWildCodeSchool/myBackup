package wildcodeschool.quests.Java09.FileIO;

public class Kunde {

    private String id;
    private String name;
    private String email;

    public Kunde(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String serializedCSV(){
        return (this.id + "," + this.name + "," + this.email + System.lineSeparator());
    }

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
