package APIooDay04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 表示直角坐标系得一个点
 */
public class Point {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3,4));
        list.add(new Point(2,5));
        list.add(new Point(13,15));
        list.add(new Point(5,6));
        list.add(new Point(34,56));
        System.out.println(list);
        /*

        Collections.sort(list);
        该方法对集合进行自然排序的前提是,该集合中得袁旭必须实现了接口:Comparable,否则编译不通过
        Comparable具有侵入性

        当我们直接使用上述方式排序某个集合时,若报错则放弃
        不推荐我们定义的类型作为元素是,为了排序必须时间接口Comparable
        因为他对我们的程序造成了侵入性

        侵入性:当我们使用某个类提供的方法是,该方法反过来要求我们你为其修改其他额外地方的代码,即:侵入性

        Spring
        */


        /*
            Collcetions提供了一个重载的sort方法,该方法不要求元素必须实现Comparable接口,
            而是在使用sort方法时临时传入一个比较规则
            该比较规则类的实现接口:
            Comparaotr
         */
//        Comparator c = new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {//该方法由sort自动调用
//                //比较规则:点到原点的距离,长的大
//                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int len2 = o2.getX()* o2.getX()+ o2.getY()* o2.getY();
//                return len1-len2;
//            }
            Comparator c ;
            Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {//该方法由sort自动调用
               //比较规则:点到原点的距离,长的大
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()* o2.getX()+ o2.getY()* o2.getY();
                return len1-len2;
            };
        });
        System.out.println(list);




    }




















    private int x ;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
