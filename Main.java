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

    public void layEggs() {
        System.out.println(name + " lays eggs.");
    }
}

class Insect extends Animal implements Flyable {
    public Insect(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Buzz!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is buzzing around.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Bird("Pigeon");
        pigeon.makeSound();
        pigeon.fly();
        pigeon.sleep();
        pigeon.layEggs();

        Insect bee = new Insect("Bee");
        bee.makeSound();
        bee.fly();
        bee.sleep();
    }
}
