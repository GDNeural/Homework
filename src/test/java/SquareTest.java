import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void getArea() throws Exception {
        Square square1 = new Square(5);
        Square square2 = new Square(10);
        Square square3 = new Square(15);

        int actual1 = square1.getArea();
        int actual2 = square2.getArea();
        int actual3 = square3.getArea();

        int expected1 = 25;
        int expected2 = 100;
        int expected3 = 225;

        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getException() throws Exception {
        Square square1 = new Square(0);
        Square square2 = new Square(-1);

        square1.getArea();
        square2.getArea();
    }

}