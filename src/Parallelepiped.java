public class Parallelepiped extends Shape {
    int sideLength;
    int smallAngle = 0;
    int bigAngle = 0;
    int height = 0;

    Parallelepiped(int sideLength, int smallAngle, int bigAngle, int height) {
        this.sideLength = sideLength;
        this.smallAngle = smallAngle;
        this.bigAngle = bigAngle;
        this.height = height;
        this.position = new Position(0, 0);
    }

    Parallelepiped(int sideLength, int smallAngle, int bigAngle) {
        this.sideLength = sideLength;
        this.smallAngle = smallAngle;
        this.bigAngle = bigAngle;
        this.position = new Position(0, 0);
    }

    Parallelepiped(int sideLength, int angle) {
        this.sideLength = sideLength;
        this.smallAngle = angle;
        this.bigAngle = angle;
        this.position = new Position(0, 0);
    }

    Parallelepiped(int sideLength) {
        this.sideLength = sideLength;
        this.position = new Position(0, 0);
    }

    double getSquare() {
        return Math.sin(this.smallAngle) * sideLength * sideLength;
    }

    double getPerimeter() {
        return sideLength * 4;
    }

    String getState() {
        String positionStr = "Position: x = " + this.position.x + "; y = " + this.position.y + ";";
        String baseStr = "Base side length: " + this.sideLength + "; Small angle: " + this.smallAngle + ";";

        return "Instance of Parallelepiped." + positionStr + " " + baseStr + " Height: " + this.height;
    }
}
