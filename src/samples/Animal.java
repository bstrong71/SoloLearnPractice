package samples;

abstract class Animal {
    public int legs;
    public int age;

    // declaring abstract method for printing animal age
    public abstract int printAge();

    public void eat() {
        System.out.println("Nom nom nom");
    }

    // declaring abstract method for animal making sound
    abstract void makeSound();

}
