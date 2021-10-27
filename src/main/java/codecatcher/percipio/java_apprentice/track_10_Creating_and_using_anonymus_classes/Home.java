package codecatcher.percipio.java_apprentice.track_10_Creating_and_using_anonymus_classes;

public class Home {

    private String type;
    private String city;
    private int areaSqFt;
    private int price;

    public Home(String type, String city, int areaSqFt, int price) {
        this.type = type;
        this.city = city;
        this.areaSqFt = areaSqFt;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public int getAreaSqFt() {
        return areaSqFt;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("\nType: %s, city: %s, area: %d, price: %d",
                type, city, areaSqFt, price);
    }
}
