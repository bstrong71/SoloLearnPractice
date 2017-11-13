public class MyClass {
    public static void main(String[] args) {
        // vehicle color will be red
        Vehicle v1 = new Vehicle();
        System.out.println("V1 color is " + v1.getColor());

        // vehicle color will be green
        Vehicle v2 = new Vehicle("green");
        System.out.println("V2 color is " + v2.getColor());
    }
}
