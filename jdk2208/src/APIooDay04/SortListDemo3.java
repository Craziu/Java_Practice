package APIooDay04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小泽老师");
        list.add("范老师");
        list.add("刘桑");

        System.out.println(list);
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        } ;
        Collections.sort(list,c);
        System.out.println(list);

    }
}
