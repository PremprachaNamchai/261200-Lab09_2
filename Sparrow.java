public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow moves by walking or flying.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies.");
    }
}
