package APIooDay04;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合提供了一对重载的add,remove方法,也是通过下标进性相关操作
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add(3,"six");

        System.out.println(list);
        list.remove(2);
        /*
            E remove(int index)
            删除并返回指定位置的元素
         */
        System.out.println(list);
    }
}
