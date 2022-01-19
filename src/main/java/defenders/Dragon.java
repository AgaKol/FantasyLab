package defenders;

import behaviours.IDefend;
import enemies.Enemy;

public class Dragon implements IDefend{

    @Override
    public void defend(Enemy _enemy){
        int enemyHP = _enemy.getHP();
        int currentHP = enemyHP - 50;
        _enemy.setHP(currentHP);
    }

}
