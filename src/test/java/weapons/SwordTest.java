package weapons;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;
    Enemy enemy;

    @Before
    public void before() {
        sword = new Sword(10);
        enemy = new Orc(50);
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(10, sword.getDamageValue());
    }

    @Test
    public void canSetDamageValue() {
        sword.setDamageValue(25);
        assertEquals(25, sword.getDamageValue());
    }

    @Test
    public void canAttack() {
        sword.attack(enemy);
        assertEquals(40, enemy.getHP());
    }
}
