package lotr;

public class Hobbit extends Character {
    public Hobbit(int power, int hp) {
        super(power, hp); 
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
