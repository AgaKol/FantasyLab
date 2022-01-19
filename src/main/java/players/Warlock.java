package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage {

    public Warlock(String name, int HP, ISpell spell, IDefend defender) {
        super(name, HP, spell, defender);
    }
}
