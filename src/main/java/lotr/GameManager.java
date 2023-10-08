package lotr;
import lotr.Character;
import lotr.Hobbit;

public class GameManager {
    void engageInBattle(Character fighter1, Character fighter2) {
        if (fighter1 instanceof Hobbit && fighter2 instanceof Hobbit) {
            System.out.println("Average game");
            return;
        }

        while (fighter1.isAlive() && fighter2.isAlive()) {
            System.out.print(fighter1);
            System.out.print(" kick ");
            System.out.println(fighter2);

            fighter1.kick(fighter2);

            Character tempCharacter = fighter1;
            fighter1 = fighter2;
            fighter2 = tempCharacter;
        }

        System.out.print(fighter1.isAlive() ? fighter2 : fighter1);
        System.out.println("death");
    }
}
