package players;

import behaviours.IWeapon;
import org.junit.Test;
import weapons.*;
import enemies.Enemy;
import enemies.Goblin;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BarbarianTest
{
    Barbarian barbarian;
    IWeapon weapon;
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Goblin(80);
        weapon = new Axe(25);
        barbarian = new Barbarian("Greg", 100, weapon);
    }

    @Test
    public void canDoubleAttack(){
        barbarian.doubleAttack(enemy);
        assertEquals(30, enemy.getHP());
    }

    @Test
    public void canUseRage(){
        barbarian.setHP(15);
        barbarian.rage(enemy);
        assertEquals(30, enemy.getHP());
    }

    @Test
    public void cantUseRage(){
        barbarian.rage(enemy);
        assertEquals(80, enemy.getHP());
    }
}


