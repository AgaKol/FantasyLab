package weapons;
import enemies.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;
    Goblin goblin;

    @Before
    public void before() {
        club = new Club(30);
        goblin = new Goblin(70);
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(30, club.getDamageValue());
    }

    @Test
    public void canSetDamageValue() {
        club.setDamageValue(15);
        assertEquals(15, club.getDamageValue());
    }

    @Test
    public void canAttack(){
        club.attack(goblin);
        assertEquals(40, goblin.getHP());
    }

}
