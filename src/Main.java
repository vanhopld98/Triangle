public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(5.0, 4.0);
        System.out.println(shape);

        Triangle triangle = new Triangle(shape.getSide1(), shape.getSide2(), 3.0);
        System.out.println(triangle);

    }
}