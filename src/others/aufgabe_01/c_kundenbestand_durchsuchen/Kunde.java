package others.aufgabe_01.c_kundenbestand_durchsuchen;

public class Kunde {

    private String custLastName;
    private String custFirstName;
    private String custStreet;
    private String custStreetNumber;
    private String custPostalCode;
    private String custLocation;
    private String custPhone;
    private String custMobile;
    private String custEmail;


    public Kunde(String custLastName, String custFirstName, String custStreet, String custStreetNumber,
                 String custPostalCode, String custLocation, String custPhone, String custMobile, String custEmail){
        this.custLastName = custLastName;
        this.custFirstName = custFirstName;
        this.custStreet = custStreet;
        this.custStreetNumber = custStreetNumber;
        this.custPostalCode = custPostalCode;
        this.custLocation = custLocation;
        this.custPhone = custPhone;
        this.custMobile = custMobile;
        this.custEmail = custEmail;
    }

    @Override
    public String toString(){
        String result;
        result = this.getCustFirstName() + ", ";
        result += this.getCustLastName() + ", ";
        result += this.getCustStreet() + ", ";
        result += this.getCustStreetNumber() + ", ";
        result += this.getCustPostalCode() + ", ";
        result += this.getCustLocation() + ", ";
        result += this.getCustPhone() + ", ";
        result += this.getCustMobile() + ", ";
        result += this.getCustEmail() +"\n";
        return result;
    }



    public String getCustLastName() {
        return custLastName;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public String getCustStreet() {
        return custStreet;
    }

    public String getCustStreetNumber() {
        return custStreetNumber;
    }

    public String getCustPostalCode() {
        return custPostalCode;
    }

    public String getCustLocation() {
        return custLocation;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public String getCustEmail() {
        return custEmail;
    }
}
