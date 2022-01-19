package players;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Fighter extends Player{
    IWeapon weapon;

    public Fighter(String _name, int _HP, IWeapon _weapon){
        super(_name, _HP);
        this.weapon = _weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void fighterAttack(Enemy _enemy){
        weapon.attack(_enemy);
    }

    public void doubleAttack(Enemy enemy){
        fighterAttack(enemy);
        fighterAttack(enemy);
    }
}
