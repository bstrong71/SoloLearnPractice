package samples;

public class Dog extends Animal {
    public Dog() {
        legs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
