package samples;

public class Dog extends Animal {
    public Dog() {
        legs = 4;
        age = 5;
    }

    public int printAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
