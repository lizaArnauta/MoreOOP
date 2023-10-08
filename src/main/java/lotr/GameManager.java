package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight between Character 1 and Character 2 begins!");

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Character 1 attacks Character 2.");
            c1.kick(c2);
            printCharacterStatus(c1, c2);

            if (!c2.isAlive()) {
                System.out.println("Character 2 is defeated. Character 1 wins!");
                break;
            }

            System.out.println("Character 2 attacks Character 1.");
            c2.kick(c1);
            printCharacterStatus(c1, c2);

            if (!c1.isAlive()) {
                System.out.println("Character 1 is defeated. Character 2 wins!");
                break;
            }
        }
    }

    private void printCharacterStatus(Character c1, Character c2) {
        System.out.println("Character 1: HP=" + c1.getHp());
        System.out.println("Character 2: HP=" + c2.getHp());
    }

    public static void main(String[] args) {
        Knight knight = new Knight();
        Hobbit hobbit = new Hobbit(0, 0);

        GameManager gameManager = new GameManager();
        gameManager.fight(knight, hobbit);
    }
}
