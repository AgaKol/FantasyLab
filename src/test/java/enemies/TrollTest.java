package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    
    Troll troll;
    
    @Before
    public void before() {
        troll = new Troll(100);
    }

    @Test
    public void canGetHP() {
        assertEquals(100, troll.getHP());
    }

    @Test
    public void canSetHP() {
        troll.setHP(70);
        assertEquals(70, troll.getHP());
    }

    @Test
    public void canGetDamage() {
        troll.takeDamage(40);
        assertEquals(60, troll.getHP());
    }
}
