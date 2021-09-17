import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void getArea() throws Exception {
        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(30, 40);
        Rectangle rectangle3 = new Rectangle(100, 200);

        int actual1 = rectangle1.getArea();
        int actual2 = rectangle2.getArea();
        int actual3 = rectangle3.getArea();

        int expected1 = 2;
        int expected2 = 1200;
        int expected3 = 20000;

        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getException() throws Exception {
        Rectangle rectangle1 = new Rectangle(0, 1);
        Rectangle rectangle2 = new Rectangle(1, 0);
        Rectangle rectangle3 = new Rectangle(5, 5);

        rectangle1.getArea();
        rectangle2.getArea();
        rectangle3.getArea();
    }

}