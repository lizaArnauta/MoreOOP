package kick;

import java.util.Random;

import lotr.Character;

public class KingKick implements KickStrategy{

    @Override
    public void kick(Character one, Character opponent) {
        Random rand = new Random();
        opponent.setHp(opponent.getHp()-rand.nextInt(one.getPower()+1));
    
}
}