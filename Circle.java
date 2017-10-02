package HomeWorkLessonTwoTasksAll;

public class Circle extends Shape {

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Circle(){
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

    @Override
    public String toString() {
        return "Circle {" +
                "a = " + a +
                ", b = " + b +
                '}';
    }

    @Override
    double getPerimeter() {
        return Math.PI*2*Point.distanceBetweenPoints(a,b);
    }

    @Override
    double getArea() {
        return Math.PI*Math.pow(Point.distanceBetweenPoints(a,b), 2);
    }
}
