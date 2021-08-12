public class Shape {
    private double side1 = 1.0f;
    private double side2 = 1.0f;

    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Shape() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Shape { " +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                " }";
    }
}