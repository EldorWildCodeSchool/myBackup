package wildcodeschool.dojos.dojo_20210920;

public class ExklusivKunde extends Kunde {

    private double kundenRabatt = 0.9d;

    public ExklusivKunde(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double berechneRabatt(int wert) {
        return wert * this.kundenRabatt;
    }
}
