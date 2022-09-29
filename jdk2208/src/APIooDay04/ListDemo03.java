package APIooDay04;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集操作
 */
public class ListDemo03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <10; i++){
            list.add(i);
        }

        System.out.println(list);
        //获取[3-7]
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);
        for(int i = 0;i < subList.size();i++){
            int num = subList.get(i);
            num = num*10;
            subList.set(i,num);
        }
        System.out.println(subList);
        //对子集的操作就是对元季河的操作
        System.out.println(list);
        //删除集合重2-8的部分
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
