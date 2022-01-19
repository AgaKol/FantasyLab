package enemies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoblinTest {

    Goblin goblin;

    @Before
    public void before() {
        goblin = new Goblin(20);
    }

    @Test
    public void canGetHP() {
        assertEquals(20, goblin.getHP());
    }

    @Test
    public void canSetHP() {
        goblin.setHP(30);
        assertEquals(30, goblin.getHP());
    }

    @Test
    public void canTakeDamage() {
        goblin.takeDamage(5);
        assertEquals(15, goblin.getHP());
    }
}
