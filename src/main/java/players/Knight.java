package players;

import behaviours.IWeapon;

public class Knight extends Fighter{

    private int armor;

    public Knight(String _name, int _HP, IWeapon _weapon) {
        super(_name, _HP, _weapon);
        this.armor = 20;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void fixArmor(){
        setArmor(20);
    }
}
