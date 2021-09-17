import java.awt.geom.Area;

public class Figures {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15);
        try {
            int AreaOfACircle = circle1.getArea();
            System.out.println(AreaOfACircle);
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
}

interface gettingArea {
    int getArea() throws Exception;
}

class Circle implements gettingArea {
    private int radius;
    public static final float PI = 3.14f;

    public Circle(int r) {
        this.radius = r;
    }

    public int getArea() throws Exception {
        if (radius < 1) {
            throw new IllegalArgumentException("Init radius must be >= 1");
        } else {
            return Math.round(radius * radius * PI);
        }
    }

}

class Square implements gettingArea {
    private int side;

    public Square(int s) {
        this.side = s;
    }

    public int getArea() throws Exception {
        if (side < 1) {
            throw new IllegalArgumentException("Init side must be >= 1");
        } else {
            return side * side;
        }
    }

}

class Rectangle implements gettingArea {
    private int side;
    private int base;

    public Rectangle(int s, int b) {
        this.side = s;
        this.base = b;
    }

    public int getArea() throws Exception {
        if (side < 1 || base < 1) {
            throw new IllegalArgumentException("Init side or base must be >= 1");
        } else if (side == base) {
            throw new IllegalArgumentException("Оne of the arguments must be greater than the other");
        } else {
            return side * base;
        }
    }

}