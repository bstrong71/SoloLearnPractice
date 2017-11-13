public class MyClass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        v1.setColor("red");
        System.out.println("This vehicle's color is " + v1.getColor() + ".");

        v2.horn();
    }
}
