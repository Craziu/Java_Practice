package APIooDay03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型的演示
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<Point> c = new ArrayList<>();//在泛型中都可以设置数据类型,若不符合则会发生编译错误
        c.add(new Point(1,2));
        c.add(new Point(2,3));
        c.add(new Point(3,4));
        c.add(new Point(4,5));


        Iterator<Point> it = c.iterator();
        while (it.hasNext()){
            Point p = it.next();//类型固定为Point
            System.out.println(p);
        }

        for(Point p : c){
            System.out.println(p);
        }

















        /*
        Collection<String> c = new ArrayList<>();
        c.add("abc");
        //c.add(123);
        //在该集合中只能装String类型,如果存在其他类型会发生编译错误,即:其他类型违背了集合C所规定的泛型E的实际类型
        //c.add(new Point(1,2);//编译错误,理由同上


        //迭代器时所指定的泛型应该与其遍历的集合的泛型一致
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String str = it.next();//指定泛型后,获取元素无需手动强转,在该函数中已经实现了操作
            System.out.println(str);
        }


        for(String str : c){
            System.out.println(str);
        }
       */
    }
        /*Collection c = new ArrayList();
        c.add("abc");
        c.add(new Point(1,2));
        c.add(123);                 //会进行自动装箱操作,在数组集合中里面会装同类型
    }*/
}
