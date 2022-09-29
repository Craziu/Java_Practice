package APIooDay03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合间的操作演示
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1"+c1);

        Collection c2 = new ArrayList();
        c2.add("Android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2"+c2);


        /**
         * boolean addAll(Collection c)
         * 将参数给定的集合中的所有元素廷加到当前集合中
         * 添加后当前集合发生改变则返回true
         */
        c1.addAll(c2);//将c2添加到c1中
        System.out.println("c1"+c1);
        System.out.println("c2"+c2);

        /**
         * boolaen containsAll(Collection c)
         * 判断当前集合中是否包含参数集合中的所有元素
         */
        Collection c3 = new ArrayList();
        c3.add("c++");
        c3.add("java");
        c3.add("go");
        System.out.println("c3"+c3);

        boolean contains = c1.containsAll(c3);//判断c1中是否包含c3
        System.out.println("包含所有"+contains);


        //retainAll
        //取交集,c1中仅保留c3中共有的元素
        c1.retainAll(c3);
        System.out.println("c1:"+c1);
        System.out.println("c3:"+c3);



        //删交集,将c1与c3中共有的元素删除,c3不变
        c1.removeAll(c3);
        System.out.println("c1:"+c1);
        System.out.println("C3:"+c3);
    }
}
