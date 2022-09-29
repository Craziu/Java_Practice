package APIooDay03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转数组
 * Collection接口提供了toArray方法,可以将当前集合转换为一个数组
 *
 *
 *
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("123");
        c.add("345");
        System.out.println(c);


        //集合转化成数组,则会按照集合的大小给赋值
        //若参数数组元素个数等于关于集合元素个数,正常转换(按照集合大小给数组)
        //如果参数数组元素个数大于集合元素个数.正常转换,多余输出为默认值(null)(类似于扩容)
        //如果参数数组元素个数小于集合元素个数,则按照集合大小给数组
        String[] array = c.toArray(new String[0]);//new什么转什么,一般情况下写String[]中写0
        System.out.println(Arrays.toString(array));


    }
}
