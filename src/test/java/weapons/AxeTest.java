package weapons;
import enemies.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;
    Enemy orc;

    @Before
    public void before() {
        axe = new Axe(20);
        orc = new Orc(100);
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(20, axe.getDamageValue());
    }

    @Test
    public void canSetDamageValue() {
        axe.setDamageValue(25);
        assertEquals(25, axe.getDamageValue());
    }

    @Test
    public void canAttack() {
        axe.attack(orc);
        assertEquals(80, orc.getHP());
    }


}
