package HomeWorkLessonTwoTasksAll;

public class Main {
    public static void main(String[] args) {

        Point one = new Point(5, 6);
        Point two = new Point(-6, 12);
        Point three = new Point(9, -5);
        Point four = new Point(-4, -8);

        Board board = new Board();

        Circle circle = new Circle(one, four);
        circle.getArea();
        circle.getPerimeter();

        Square square = new Square(one, two, three, four);
        square.getArea();
        square.getPerimeter();

        Triangle triangle = new Triangle(two, four, one);
        triangle.getArea();
        triangle.getPerimeter();

        board.putInArea(circle, 2);
        board.putInArea(triangle, 1);
        board.putInArea(square, 3);
        board.getOutFromArea(2);
        board.putInArea(circle, 4);
        board.putInArea(circle, 0);

        board.information();
    }
}
