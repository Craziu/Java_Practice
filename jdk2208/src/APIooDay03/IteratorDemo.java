package APIooDay03;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历:迭代器Iterator
 */
public class IteratorDemo {
    public static void main(String[] args) {
        
        //创建迭代器
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);

        //通过c得到一个迭代器------问,取,删三个操作,问和取同时使用(配套),删不是必要操作
        /**
         * 迭代器的常用方法:
         * 1)boolean hasNext()=======问(只承接问的功能)
         *      询问集合是否还有"下一个"元素可迭代
         *      注意:迭代器默认开始位置是在第一个元素开始之前
         *           无论调用多少次的hasNext(),但是迭代器的位置不发生改变
         * 2)Objec next()============取(只承接取得功能)
         * 迭代器向后移动一个位置来指向集合的下一个元素将其获取
         */
        Iterator it = c.iterator();//获取集合c的迭代器===========造型
        while(it.hasNext()){       //若有下一个元素
            String str = (String)it.next();
            if("#".equals(str)){//若str为#号
                //c.remove(str);------不可用,提示不支持,原因:在迭代器遍历过程中不能通过集合方法增删元素,否则会报异常
                it.remove();//删除next()方法所获取得元素,可以借助remove()方法
            }
            System.out.println(str);
        }
        System.out.println(c);//输出结合元素
    }
}
