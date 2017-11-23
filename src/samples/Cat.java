package samples;

public class Cat extends Animal {
    public Cat() {
        legs = 4;
        age = 3;
    }

    public int printAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Meow meow meow meow");
    }
}
