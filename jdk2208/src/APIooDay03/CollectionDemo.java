package APIooDay03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,2));
        c.add(new Point(2,3));
        c.add(new Point(5,4));
        c.add(new Point(6,7));
        c.add(new Point(7,0));

        /**
         * 集合重写了Object的toString()方法,格式如下:
         * [元素1.toString(),元素2.toString,元素3.toString()...]
         */
        System.out.println();

        Collection d = new ArrayList();
        if(d.isEmpty()){
            System.out.println("Noth");
        }

        /**
         * boolean contains(Object o )
         * 判断当前集合是否包含给定元素
         * 判断依据是给定元素是否与集合元素存在equals比较为true的情况
         */

        Point p = new Point(1,2);
        boolean contains = c.contains(p);
        System.out.println("是否包含"+contains);


        /**
         * boolean remove(Oobject o)
         * 从集合中删除给定元素equals比较为true的元素
         * 若存在重复元素则只删除一次
         */
        c.remove(p);
        System.out.println(c);


























        /*Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        boolean b = c.add("one");//类是可以重复的集合
        System.out.println(c);




        int size = c.size();//获取集合中的元素
        System.out.println("size"+size);


        boolean isEmpty = c.isEmpty();//判断是否为空集
        System.out.println("是否为空集"+isEmpty);


        c.clear();//清空集合
        System.out.println("集合已清空");
        System.out.println(c);
        System.out.println("size"+c.size());
        System.out.println("是否是空集"+c.isEmpty());*/
    }
}
