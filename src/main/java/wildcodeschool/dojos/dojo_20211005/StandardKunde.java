package wildcodeschool.dojos.dojo_20211005;

import java.util.Date;

public abstract class StandardKunde extends Kunde {

    public StandardKunde(String id, String name, String email, Date geburtstag, Date leztzterKauf) {
        super(id, name, email, geburtstag, leztzterKauf);
    }
}
