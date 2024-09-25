public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car theToyota = new Car();

        theToyota.brand = "Toyota";
        theToyota.speed = 150;

        System.out.println("the " + theToyota.brand + " has speed " + theToyota.speed);

        Car bil2 = new Car();

        bil2.brand = "izuzu";
        bil2.speed = 2;

        System.out.println("the " + bil2.brand + " has speed " + bil2.speed);

        bil2.speed = bil2.speed + 10;

        System.out.println("the " + bil2.brand + " has speed " + bil2.speed);
    }
}
