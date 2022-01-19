package players;

import healing.*;
import org.junit.Test;
import weapons.Club;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Player player;
    Potion potion;
    Herbs herbs;

    Club club;

    @Before
    public void before(){
        potion = new Potion();
        herbs = new Herbs();
        club = new Club(25);
        player = new Dwarf("Bob", 100, club);
        cleric = new Cleric("Rob", 120, potion);
    }

    @Test
    public void canGetHealingItem(){
        assertEquals(potion, cleric.getHealingItem());
    }

    @Test
    public void canSetHealingItem(){
        cleric.setHealingItem(herbs);
        assertEquals(herbs, cleric.getHealingItem());
    }

    @Test
    public void canHealPlayer(){
        cleric.healPlayer(player);
        assertEquals(115, player.getHP());
    }
}
