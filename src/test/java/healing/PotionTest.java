package healing;

import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Player;
import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;
    Player player;

    @Before
    public void before() {
        potion = new Potion();
        player = new Cleric("Bob", 100, potion);
    }

    @Test
    public void canGetHealingValue() {
        assertEquals(15, potion.getHealingValue());
    }

    @Test
    public void canSetHealingValue() {
        potion.setHealingValue(20);
        assertEquals(20, potion.getHealingValue());
    }

    @Test
    public void canHeal() {
        potion.heal(player);
        assertEquals(115, player.getHP());
    }
}
