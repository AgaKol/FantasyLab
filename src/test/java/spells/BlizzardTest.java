package spells;

import enemies.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlizzardTest {

    Blizzard blizzard;
    Enemy enemy;

    @Before
    public void before() {
        blizzard = new Blizzard();
        enemy = new Troll(150);
    }

    @Test
    public void canGetPowerValue(){
        assertEquals(30, blizzard.getPowerValue());
    }

    @Test
    public void canSetPowerValue() {
        blizzard.setPowerValue(35);
        assertEquals(35, blizzard.getPowerValue());
    }

    @Test
    public void canCast(){
        blizzard.cast(enemy);
        assertEquals(120, enemy.getHP());
    }
}
