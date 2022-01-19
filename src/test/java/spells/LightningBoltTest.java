package spells;

import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningBoltTest {

    LightningBolt lightningBolt;
    Enemy enemy;

    @Before
    public void before() {
        lightningBolt = new LightningBolt();
        enemy = new Troll(100);
    }

    @Test
    public void canGetPowerValue() {
        assertEquals(25, lightningBolt.getPowerValue());
    }

    @Test
    public void canSetPowerValue() {
        lightningBolt.setPowerValue(35);
        assertEquals(35, lightningBolt.getPowerValue());
    }

    @Test
    public void cast() {
        lightningBolt.cast(enemy);
        assertEquals(75, enemy.getHP());
    }
}
