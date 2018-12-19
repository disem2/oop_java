public abstract class Shape {
    Position position;

    abstract double getSquare();
    abstract double getPerimeter();
    abstract String getState();

    void move(Position newPosition) {
        this.position = newPosition;
    };
}
