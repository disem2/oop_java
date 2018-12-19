public class Main {
    public static void main(String[] args) {
        Parallelepiped par = new Parallelepiped(50, 30, 10);
        par.move(new Position(10, 10));

        System.out.println(par.getState());

        Diamond diamond = new Diamond(40, 20);

        System.out.println(diamond.getState());

        Vector vector = new Vector(10);

        System.out.println(vector.getState());
    }
}
