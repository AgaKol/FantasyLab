package players;

import behaviours.IHeal;

public class Cleric extends Player{

    private IHeal healingItem;

    public Cleric(String name, int HP, IHeal healingItem) {
        super(name, HP);
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(IHeal healingItem) {
        this.healingItem = healingItem;
    }

    public void healPlayer(Player _player){
        healingItem.heal(_player);
    }
}
