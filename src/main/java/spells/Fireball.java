package spells;

import behaviours.ISpell;
import enemies.Enemy;

public class Fireball implements ISpell {

    private int powerValue;

    public Fireball() {
        this.powerValue = 20;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(int powerValue) {
        this.powerValue = powerValue;
    }

    @Override
    public void cast(Enemy _enemy) {
        int enemyHP = _enemy.getHP();
        int currentHP = enemyHP - this.powerValue;
        _enemy.setHP(currentHP);
    }
}
