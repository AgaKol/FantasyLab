package spells;

import behaviours.ISpell;
import enemies.Enemy;

public class Blizzard implements ISpell {
    private int powerValue;

    public Blizzard(){
        this.powerValue = 30;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(int powerValue) {
        this.powerValue = powerValue;
    }

    @Override
    public void cast(Enemy _enemy){
        int enemyHP = _enemy.getHP();
        int currentHP = enemyHP - this.powerValue;
        _enemy.setHP(currentHP);
    }
}
