package APIooday02;

import com.sun.javafx.image.impl.ByteIndexed;
import jdk.nashorn.internal.objects.annotations.Constructor;
import jdk.nashorn.internal.objects.annotations.Getter;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        //Point{x=100,y=200}
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
