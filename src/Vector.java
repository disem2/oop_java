public class Vector extends Diamond {
    Vector(int length) {
        super(length);
    }

    String getState() {
        return "Instance of Vector." + " Length: " + this.sideLength + ';';
    }
}
