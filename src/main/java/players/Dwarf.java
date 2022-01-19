package players;

import behaviours.IWeapon;

public class Dwarf extends Fighter{
    private int drinkCount;
    public Dwarf(String _name, int _HP, IWeapon _weapon) {
        super(_name, _HP, _weapon);
        this.drinkCount = 5;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    public void drink() {
        if(drinkCount > 0) {
            int currentHP = getHP();
            this.setHP(currentHP + 10);
            setDrinkCount(getDrinkCount() - 1);
        }
    }
}
