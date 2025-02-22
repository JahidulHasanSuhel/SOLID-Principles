package LiskovSubstitution.Bad;

public class Penguin {
    @Override
    public void fly() {
        // Penguin can't fly (Exception!)
        throw new UnsupportedOperationException();
    }

    @Override
    public void peck() {
        // Penguin pecks
    }
}
