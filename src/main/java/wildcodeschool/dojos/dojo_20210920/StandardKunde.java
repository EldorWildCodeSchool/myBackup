package wildcodeschool.dojos.dojo_20210920;

public class StandardKunde extends Kunde {

    private double kundenRabatt = 1.0d;

    public StandardKunde(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double berechneRabatt(int wert) {
        return wert * this.kundenRabatt;
    }
}
