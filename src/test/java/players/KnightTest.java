package players;

import behaviours.IWeapon;
import org.junit.Test;
import weapons.*;
import enemies.*;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    IWeapon weapon;
    Enemy enemy;

    @Before
    public void before(){
        weapon = new Sword(30);
        enemy = new Orc(100);
        knight = new Knight("Joan", 120, weapon);
    }

    @Test
    public void canGetArmor() {
        assertEquals(20, knight.getArmor());
    }


    @Test
    public void canSetArmor(){
        knight.setArmor(15);
        assertEquals(15, knight.getArmor());
    }

    @Test
    public void canFixArmor(){
        knight.setArmor(0);
        knight.fixArmor();
        assertEquals(20, knight.getArmor());
    }
}
