package wildcodeschool.dojos.dojo_20211005;

import java.util.Date;

public class ExklusivKunde extends Kunde {

    //Constructor
    public ExklusivKunde(String id, String name, String email, Date geburtstag, Date leztzterKauf) {
        super(id, name, email, geburtstag, leztzterKauf);
    }

    @Override
    public double berechneRabatt(int wert) {
        return wert * 0.9;
    }
}
