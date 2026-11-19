class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Bird("Pigeon");
        pigeon.makeSound();
        pigeon.fly();
        pigeon.sleep();
    }
}
