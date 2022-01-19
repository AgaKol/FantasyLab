package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Club implements IWeapon {
    
    private int damageValue;

    public Club(int _damageValue) {
        this.damageValue = _damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    @Override
    public void attack(Enemy _enemy) {
        int enemyHP = _enemy.getHP();
        _enemy.setHP(enemyHP - this.damageValue);
    }
}
