package HomeWorkLessonTwoTasksAll;

public class Triangle extends Shape{

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle (){
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }

    @Override
    double getPerimeter() {
        return Point.distanceBetweenPoints(a, b) + Point.distanceBetweenPoints(b, c) + Point.distanceBetweenPoints(a, c);
    }

    @Override
    double getArea() {
        double halfOfPerimeter = this.getPerimeter()/2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - Point.distanceBetweenPoints(a, b)) * (halfOfPerimeter - Point.distanceBetweenPoints(b, c)) * (halfOfPerimeter - Point.distanceBetweenPoints(a, c)));
    }
}
