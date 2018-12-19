public class Diamond extends Parallelepiped {
    int sideLength;
    int smallAngle;
    int bigAngle;

    Diamond(int sideLength, int smallAngle, int bigAngle) {
        super(sideLength, smallAngle, bigAngle);
        this.sideLength = sideLength;
        this.smallAngle = smallAngle;
        this.bigAngle = bigAngle;
    }

    Diamond(int sideLength, int angle) {
        super(sideLength, angle);
        this.sideLength = sideLength;
        this.smallAngle = angle;
        this.bigAngle = angle;
    }

    Diamond(int sideLength) {
        super(sideLength);
        this.sideLength = sideLength;
        this.smallAngle = 0;
        this.bigAngle = 0;
    }

    String getState() {
        String baseStr = "Side length: " + this.sideLength + "; Small angle: " + this.smallAngle + ";";

        return "Instance of Diamond." + " " + baseStr + " Height: " + this.height;
    }
}
