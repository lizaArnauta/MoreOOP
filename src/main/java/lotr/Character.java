package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter
    private int power;
    @Setter
    private KickStrategy kick;

    public void kick(Character opponent) {
        if (kick != null) {
            kick.kick(this, opponent);
        } else {
            System.out.println("No kick strategy set for " + this.getClass().getSimpleName());
        }
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
