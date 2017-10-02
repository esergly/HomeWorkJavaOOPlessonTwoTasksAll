package HomeWorkLessonTwoTasksAll;

import java.util.Arrays;

public class Board {

    private Shape[] board = new Shape[4];
    private double sumArea = 0;

    public Board(Shape[] board) {
        super();
        this.board = board;
    }

    public Board() {
        super();
    }

    public Shape[] getBoard() {
        return board;
    }

    public void setBoard(Shape[] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Board {" +
                "board = " + Arrays.toString(board) +
                '}';
    }

    public void putInArea(Shape shape, int quarter) {
        if (quarter >= 0 && board.length > quarter) {
            board[quarter] = shape;
            System.out.println("Shape is placed on quarter.");
        } else {
            System.out.println("Error for quarter choice.");
        }
    }

    public void getOutFromArea(int quarter) {
        if (quarter < board.length && quarter >= 0) {
            board[quarter] = null;
            System.out.println("Shape is removed from quarter.");
        }
    }

    public void information() {
        if (board[0] == null && board[1] == null && board[2] == null && board[3] == null) {
            System.out.println("The board have no shapes.");
        } else {
            for (int i = 0; i < board.length; i++) {
                if (board[i] != null) {
                    System.out.println("The quarter " + i + " contents of " + board[i].toString() + " which has area " + board[i].getArea());
                    sumArea += board[i].getArea();
                } else {
                    System.out.println("The quarter " + i + " is empty.");
                }

            }
        }
        System.out.println("The total area has been occupied by all shapes is equal " + sumArea);
    }
}
