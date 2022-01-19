package healing;

import behaviours.IHeal;
import players.*;

public class Herbs implements IHeal {

    int healingValue;

    public Herbs(){
        this.healingValue = 10;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public void setHealingValue(int healingValue) {
        this.healingValue = healingValue;
    }

    @Override
    public void heal(Player _player){
        _player.setHP(_player.getHP() + healingValue);
    }
}
