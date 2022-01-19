package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before

    public void before() {
        orc = new Orc(50);
    }

    @Test
    public void canGetHP() {
        assertEquals(50, orc.getHP());
    }

    @Test
    public void canSetHP() {
        orc.setHP(70);
        assertEquals(70, orc.getHP());
    }

    @Test
    public void canGetDamage() {
        orc.takeDamage(40);
        assertEquals(10, orc.getHP());
    }
}
