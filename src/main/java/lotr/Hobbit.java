package lotr;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3); 
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    public void toCry() {
        System.out.println("hobbit is crying so do i");
    }
}
