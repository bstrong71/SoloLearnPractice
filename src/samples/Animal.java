package samples;

abstract class Animal {
    int legs = 0;

    public void eat() {
        System.out.println("Nom nom nom");
    }

    abstract void makeSound();

}
