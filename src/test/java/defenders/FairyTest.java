package defenders;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FairyTest {

    Fairy fairy;
    Enemy enemy;

    @Before
    public void before() {
        fairy = new Fairy();
        enemy = new Orc(100);
    }

    @Test
    public void canDefend() {
        fairy.defend(enemy);
        assertEquals(85, enemy.getHP());
    }
}
