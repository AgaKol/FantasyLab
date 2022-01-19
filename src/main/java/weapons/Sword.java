package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Sword implements IWeapon{

    private int damageValue;

    public Sword(int damageValue) {
        this.damageValue = damageValue;
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
        int currentHP = enemyHP - this.damageValue;
        _enemy.setHP(currentHP);
    }


}
