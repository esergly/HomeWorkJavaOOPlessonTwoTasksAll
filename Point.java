package HomeWorkLessonTwoTasksAll;

public class Point {
    private double x;
    private double y;
    private double res;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public static double distanceBetweenPoints(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

