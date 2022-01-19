package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{
    public Wizard(String name, int HP, ISpell spell, IDefend defender) {
        super(name, HP, spell, defender);
    }
}
