package lotr;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Character {
}

public class CharacterFactory {
    private List<Character> existingCharacters;
    private Random random;

    public CharacterFactory() {
        existingCharacters = new ArrayList<>();
        existingCharacters.add(new Character());
        existingCharacters.add(new Character());
        existingCharacters.add(new Character());

        random = new Random();
    }

    public Character createCharacter() {
        int randomIndex = random.nextInt(existingCharacters.size());
        return existingCharacters.get(randomIndex);
    }

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character randomCharacter = characterFactory.createCharacter();
    }
}
