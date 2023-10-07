package lotr;

public class Elf extends Character {
    private static final int DEFAULT_POWER = 10;
    private static final int DEFAULT_HP = 10;

    public Elf() {
        super(DEFAULT_POWER, DEFAULT_HP);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < getPower()) {
            c.setHp(0);
        } else {
            setPower(getPower() - 1);
        }
    }

    @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
