package InterfaceSegregation.Bad;

public class Wolf {
    @Override
    public void eat() {
        // Wolves can eat
    }

    @Override
    public void run() {
        // Wolves can run
    }

    @Override
    public void hunt() {
        // Wolves can hunt
    }

    @Override
    public void giveAPaw() {
        // Wolves don't give a paw (Exception!)
        throw new UnsupportedOperationException();
    }
}
