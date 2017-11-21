public class MyClass {
    public static void main(String[] args) {
        // vehicle color will be red
        Vehicle v1 = new Vehicle();
        System.out.println("V1 color is " + v1.getColor());

        // vehicle color will be green
        Vehicle v2 = new Vehicle("green");
        System.out.println("V2 color is " + v2.getColor());

        Person p1 = new Person("John");
        p1.setAge(30);
        celebrateBirthday(p1);
        int previousAge = p1.getAge() - 1;
        System.out.println("John was " + previousAge + ", but now he's " + p1.getAge() + ".");

        Person p2 = new Person("Bill");
        p2.setAge(40);

        // increments count every time a Counter object is instantiated
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Number of Counter objects created: " + Counter.COUNT);
    }

    static void celebrateBirthday(Person person) {
        person.setAge(person.getAge() + 1);
    }

}
