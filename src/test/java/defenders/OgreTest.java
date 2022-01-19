package defenders;

import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;
    Enemy enemy;

    @Before
    public void before() {
        ogre = new Ogre();
        enemy = new Troll(100);
    }

    @Test
    public void canDefend() {
        ogre.defend(enemy);
        assertEquals(70, enemy.getHP());
    }
}
