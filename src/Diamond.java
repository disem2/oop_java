public class Diamond extends Parallelepiped {
    int sideLength;

    Diamond(int sideLength, int angle) {
        super(sideLength, angle);
        this.sideLength = sideLength;
        this.smallAngle = angle;
        this.bigAngle = 180 - angle;
    }

    Diamond(int sideLength) {
        super(sideLength);
        this.sideLength = sideLength;
        this.smallAngle = 0;
        this.bigAngle = 0;
    }

    String getState() {
        String baseStr = "Side length: " + this.sideLength + "; Small angle: " + this.smallAngle + ";";
        String square = "Square: " + this.getSquare() + ';';
        String perimeter = "Perimeter: " + this.getPerimeter() + ';';

        return "Instance of Diamond." + " " + baseStr + square + perimeter;
    }
}
