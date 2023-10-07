package lotr;

import java.util.Random;

public class King extends Character {
    private static final int MIN_POWER = 5;
    private static final int MAX_POWER = 15;

    private Random random;

    public King() {
        super(generateRandomPower(), generateRandomHP());
        random = new Random();
    }

    private static int generateRandomPower() {
        return MIN_POWER + new Random().nextInt(MAX_POWER - MIN_POWER + 1);
    }

    private static int generateRandomHP() {
        return MIN_POWER + new Random().nextInt(MAX_POWER - MIN_POWER + 1);
    }

    @Override
    public void kick(Character c) {
        int damage = generateRandomPower();
        c.takeDamage(damage);
    }
}
