package enemies;

public abstract class Enemy {

   private int HP;

    public Enemy(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void takeDamage(int _damage){
        int currentHP = this.HP - _damage;
        setHP(currentHP);
    }
}
