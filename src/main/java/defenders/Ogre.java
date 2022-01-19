package defenders;

import behaviours.IDefend;
import enemies.Enemy;

public class Ogre implements IDefend {


    @Override
    public void defend(Enemy _enemy) {
        int enemyHP = _enemy.getHP();
        int currentHP = enemyHP - 30;
        _enemy.setHP(currentHP);
    }
}
