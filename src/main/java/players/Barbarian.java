package players;

import behaviours.IWeapon;
import enemies.Enemy;

public class Barbarian extends Fighter{
    
    public Barbarian(String _name, int _HP, IWeapon _weapon) {
        super(_name, _HP, _weapon);
    }
    
    public void rage(Enemy enemy) {
        
        if(this.getHP()<= 20){
            doubleAttack(enemy);
        }
    }
    
}