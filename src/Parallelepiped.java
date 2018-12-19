public class Parallelepiped extends Shape {
    int sideLength;
    int smallAngle = 0;
    int bigAngle = 0;
    int height = 0;

    Parallelepiped(int sideLength, int angle, int height) {
        this.sideLength = sideLength;
        this.smallAngle = angle;
        this.bigAngle = 180 - angle;
        this.height = height;
        this.position = new Position(0, 0);
    }

    Parallelepiped(int sideLength, int angle) {
        this.sideLength = sideLength;
        this.smallAngle = angle;
        this.bigAngle = 180 - angle;
        this.position = new Position(0, 0);
    }

    Parallelepiped(int sideLength) {
        this.sideLength = sideLength;
        this.position = new Position(0, 0);
    }

    double getSquare() {
        return Math.sin(Math.PI / 180 * this.smallAngle) * sideLength * sideLength;
    }

    double getPerimeter() {
        return sideLength * 4;
    }

    String getState() {
        String positionStr = "Position: x = " + this.position.x + "; y = " + this.position.y + ";";
        String baseStr = "Base side length: " + this.sideLength + "; Small angle: " + this.smallAngle + ";";
        String square = "Square: " + this.getSquare() + ';';
        String perimeter = "Perimeter: " + this.getPerimeter() + ';';

        return "Instance of Parallelepiped." + positionStr + " " + baseStr + " Height: " + this.height + square + perimeter;
    }
}
