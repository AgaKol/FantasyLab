package healing;

import behaviours.IHeal;
import players.Player;

public class Potion implements IHeal {

    private int healingValue;

    public Potion(){
        this.healingValue = 15;
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
