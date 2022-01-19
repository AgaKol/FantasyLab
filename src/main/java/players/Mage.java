package players;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;

public abstract class Mage extends Player{

    ISpell spell;
    IDefend defender;


    public Mage(String name, int HP, ISpell spell, IDefend defender) {
        super(name, HP);
        this.spell = spell;
        this.defender = defender;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public void cast(Enemy _enemy){
        spell.cast(_enemy);
    }
}
