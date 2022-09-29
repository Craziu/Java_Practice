package APIooDay03;

import java.util.Objects;

/**
 * 点
 */
public class Point {
    private int x ;//构造方法,toString()
    private int y ;//equals(),hasCode(),getter/setter

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String string = toString();

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
