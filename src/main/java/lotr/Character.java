package lotr;
public class Character {
    private int power; 
    private int hp;    

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        c.takeDamage(power);
    }

    protected void takeDamage(int damage) {
        hp -= damage;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
}
