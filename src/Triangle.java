public class Triangle extends Shape {
    private double side3 = 1.0;

    public Triangle(double side3) {
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, side2);
        this.side3 = side3;
    }

    public Triangle() {
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + side3;
    }

    public double getP(){
        return getPerimeter()/2;
    }

    public double getArea(){
        return Math.sqrt(getP()*(getP()-getSide1())*(getP()-getSide2())*(getP()-getSide3()));
    }

    @Override
    public String toString() {
        return "Triangle { "
                + " side1 = " + getSide1()
                + ", side2 = " + getSide2()
                + ", side3 = " + getSide3()
                + ", Perimeter = " + getPerimeter()
                + ", Area = " + getArea()
                + " }";
    }
}