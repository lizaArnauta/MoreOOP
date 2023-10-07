package lotr;

import java.util.Random;

public class Knight extends Character {
    private static final int MIN_POWER = 2;
    private static final int MAX_POWER = 12;

    private Random random;

    public Knight() {
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
