package APIooDAy01;

import java.util.Objects;

/** 点 */
public class Piont {
    private int x;
    private int y;

    public Piont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piont piont = (Piont) o;
        return x == piont.x && y == piont.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX(){  //getter
        return x;
    }
    public void setX(int x){  //setter
        if(x>=0) {  //可以当作控制语句
            this.x = x;
        }
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        if(y>=0) {
            this.y = y;
        }
    }


}
