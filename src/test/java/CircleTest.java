import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void getArea() throws Exception {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        int actual1 = circle1.getArea();
        int actual2 = circle2.getArea();
        int actual3 = circle3.getArea();

        int expected1 = 79;
        int expected2 = 314;
        int expected3 = 707;

        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getException() throws Exception {
        Circle circle1 = new Circle(0);
        Circle circle2 = new Circle(-1);

        circle1.getArea();
        circle2.getArea();
    }

}