import com.sun.prism.shader.Solid_ImagePattern_Loader;
import samples.*;

public class MyClass {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        // vehicle color will be red
        Vehicle car1 = new Vehicle();
        System.out.println("Car1 color is " + car1.getColor());

        // vehicle color will be green
        Vehicle car2 = new Vehicle("green");
        System.out.println("Car2 color is " + car2.getColor());
        // calling static method from samples.Vehicle class without referring to created object
        Vehicle.horn();

        // person John created with age and has birthday
        Person p1 = new Person("John");
        p1.setAge(30);
        celebrateBirthday(p1);
        int previousAge = p1.getAge() - 1;
        System.out.println("John was " + previousAge + ", but now he's " + p1.getAge() + ".");

        // person Bill created with age
        Person p2 = new Person("Bill");
        p2.setAge(40);
        System.out.println("Bill's age is still " + p2.getAge() + ".");

        // increments COUNT every time a samples.Counter object is instantiated
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        // two different ways to access COUNT
        System.out.println("Number of samples.Counter objects created: " + Counter.COUNT);
        System.out.println("Number of samples.Counter objects created: " + c1.COUNT);

        // testing out final variable
        System.out.println("Pi is equal to " + PI + ".");

        // dog and cat inherit from animal
        Dog dog1 = new Dog();
        System.out.println("The dog's age is " + dog1.printAge());
        System.out.println("The dog is eating...");
        dog1.eat();
        System.out.println("The dog makes a sound...");
        dog1.makeSound();


        Cat cat1 = new Cat();
        System.out.println("The cat's age is " + cat1.printAge());
        System.out.println("The cat is eating...");
        cat1.eat();
        System.out.println("The cat makes a sound...");
        cat1.makeSound();

    }

    static void celebrateBirthday(Person person) {
        person.setAge(person.getAge() + 1);
    }

}
