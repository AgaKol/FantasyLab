package players;

import behaviours.IWeapon;
import enemies.Enemy;
import enemies.Goblin;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    IWeapon weapon;
    IWeapon weapon2;
    Enemy enemy;

    @Before
    public void before() {
        enemy = new Goblin(60);
        weapon = new Axe(15);
        weapon2 = new Club(10);
        dwarf = new Dwarf("Gimli", 120, weapon);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canSetName() {
        dwarf.setName("Bob");
        assertEquals("Bob", dwarf.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(120, dwarf.getHP());
    }

    @Test
    public void canSetHP() {
        dwarf.setHP(100);
        assertEquals(100, dwarf.getHP());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon, dwarf.getWeapon());
    }

    @Test
    public void canSetWeapon() {
        dwarf.setWeapon(weapon2);
        assertEquals(weapon2, dwarf.getWeapon());
    }

    @Test
    public void canAttack() {
        dwarf.fighterAttack(enemy);
        assertEquals(45, enemy.getHP());
    }

    @Test
    public void canDrink() {
        dwarf.drink();
        assertEquals(130, dwarf.getHP());
    }

    @Test
    public void cannotDrink() {
        dwarf.setDrinkCount(0);
        dwarf.drink();
        assertEquals(120, dwarf.getHP());
    }
}
