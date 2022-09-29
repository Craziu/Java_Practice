package APIooDay03;

import java.util.ArrayList;
import java.util.Collection;

public class ColletionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Point p = new Point(1,2) ;
        c.add(p);   //将p添加到集合c中---
        System.out.println("p:"+p);
        System.out.println("c:"+c);


        p.setX(100);
        System.out.println("p:"+p);
        System.out.println("c:"+c);
    }
}
