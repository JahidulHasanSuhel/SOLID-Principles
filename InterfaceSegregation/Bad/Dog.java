package InterfaceSegregation.Bad;

public class Dog {
    @Override
    public void eat() {
        // Dogs can eat
    }

    @Override
    public void run() {
        // Dogs can run
    }

    @Override
    public void hunt() {
        // Dogs don't hunt (Exception!)
        throw new UnsupportedOperationException();
    }

    @Override
    public void giveAPaw() {
        // Dogs can give a paw
    }
}
