package samples;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }
}
