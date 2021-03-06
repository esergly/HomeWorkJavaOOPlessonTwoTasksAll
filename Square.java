package HomeWorkLessonTwoTasksAll;

public class Square extends Shape{

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Square(){
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Square {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d +
                '}';
    }

    @Override
    double getPerimeter() {
        return (Point.distanceBetweenPoints(a, b) + Point.distanceBetweenPoints(b, c))*2;
    }

    @Override
    double getArea() {
        return Point.distanceBetweenPoints(a, b)*Point.distanceBetweenPoints(b, c);
    }
}
