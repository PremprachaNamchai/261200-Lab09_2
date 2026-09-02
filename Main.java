public class Main {
    static void makeMove(Moveable moveable) {
        moveable.move();
    }

    static void makeFly(Flyable flyable) {
        flyable.fly();
    }

    public static void main(String[] args) {
        Moveable sparrow = new Sparrow();
        Moveable penguin = new Penguin();
        Flyable flyingSparrow = new Sparrow();

        // Both concrete objects can replace Moveable without special-case checks (LSP).
        makeMove(sparrow);
        makeMove(penguin);

        // Only the subtype that promises Flyable is passed to makeFly().
        makeFly(flyingSparrow);
    }
}
