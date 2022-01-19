package healing;

import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Player;

import static org.junit.Assert.assertEquals;

public class HerbsTest {

    Herbs herbs;
    Player player;

    @Before
    public void before() {
        herbs = new Herbs();
        player = new Cleric("Bob", 100, herbs);
    }

    @Test
    public void canGetHealingValue() {
        assertEquals(10, herbs.getHealingValue());
    }

    @Test
    public void canSetHealingValue() {
        herbs.setHealingValue(20);
        assertEquals(20, herbs.getHealingValue());
    }

    @Test
    public void canHeal() {
        herbs.heal(player);
        assertEquals(110, player.getHP());
    }
}
