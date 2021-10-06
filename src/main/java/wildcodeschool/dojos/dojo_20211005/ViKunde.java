package wildcodeschool.dojos.dojo_20211005;

import java.util.Date;

public class ViKunde extends Kunde {

    //Constructor
    public ViKunde(String id, String name, String email, Date geburtstag, Date leztzterKauf) {
        super(id, name, email, geburtstag, leztzterKauf);
    }

    @Override
    public double berechneRabatt(int wert) {
        return wert * 0.8;
    }
}
