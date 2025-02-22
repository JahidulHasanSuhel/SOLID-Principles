package InterfaceSegregation.Good;

public class Wolf implements WidAnimal {
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
}
