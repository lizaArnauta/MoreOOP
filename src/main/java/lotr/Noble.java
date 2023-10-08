package lotr;

import java.util.Random;

import kick.NobleKick;

public abstract class Noble extends Character {
    private static final Random RANDOM_GENERATOR = new Random();
    protected int minDamage;
    protected int maxDamage;

    public Noble(int minDamage, int maxDamage) {
        super(generateRandom(minDamage, maxDamage), generateRandom(minDamage, maxDamage), new NobleKick());
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    private static int generateRandom(int min, int max) {
        return RANDOM_GENERATOR.nextInt(max - min) + min;
    }

    public int getRandomDamage() {
        return generateRandom(minDamage, maxDamage);
    }
}
