package spells;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;
    Enemy enemy;

    @Before

    public void before() {
        fireball = new Fireball();
        enemy = new Orc(100);
    }

    @Test
    public void canGetPowerValue() {
        assertEquals(20, fireball.getPowerValue());
    }

    @Test
    public void canSetPowerValue() {
        fireball.setPowerValue(35);
        assertEquals(35, fireball.getPowerValue());
    }

    @Test
    public void cast() {
        fireball.cast(enemy);
        assertEquals(80, enemy.getHP());
    }
}
