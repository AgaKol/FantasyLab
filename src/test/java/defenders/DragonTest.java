package defenders;


import enemies.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Enemy enemy;

    @Before
    public void before(){
        dragon = new Dragon();
        enemy = new Orc(100);
    }

    @Test
    public void canDefend(){
        dragon.defend(enemy);
        assertEquals(50, enemy.getHP());
    }
}
