package players;

import behaviours.IDefend;
import behaviours.ISpell;
import defenders.Dragon;
import defenders.Fairy;
import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import spells.Blizzard;
import spells.LightningBolt;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;
    ISpell spell;
    ISpell spell2;
    IDefend defender;
    IDefend defender2;

    @Before
    public void before() {
        spell = new LightningBolt();
        spell2 = new Blizzard();
        enemy = new Orc(100);
        defender = new Dragon();
        defender2 = new Fairy();
        wizard = new Wizard("Merlin", 50, spell, defender);
    }

    @Test
    public void canGetSpell() {
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void canSetSpell() {
        wizard.setSpell(spell2);
        assertEquals(spell2, wizard.getSpell());
    }

    @Test
    public void canGetDefender() {
        assertEquals(defender, wizard.getDefender());
    }

    @Test
    public void canSetDefender() {
        wizard.setDefender(defender2);
        assertEquals(defender2, wizard.getDefender());
    }

    @Test
    public void canCast() {
        wizard.cast(enemy);
        assertEquals(75, enemy.getHP());
    }
}
