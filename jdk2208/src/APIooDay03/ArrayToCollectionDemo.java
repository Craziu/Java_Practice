package APIooDay03;

import java.util.Arrays;
import java.util.List;

/**
 *  数组转集合====数组的工具类:Arrays copyof(),sort()
 *  java.util.Arrays提供了asList
 *  asList方法进行转换
 */
public class ArrayToCollectionDemo {
    public static void main(String[] args) {
        String [] array = {"one","two","three"};
        System.out.println("array"+ Arrays.toString(array));




        //Array数组转为集合
        //asList()方法会返回内部ArrayList,该ArrayList内部直接引用给定数组array
        List<String> list = Arrays.asList(array);
        System.out.println("list: "+list);


        //对数组操作后,集合也会做相对应的改变
        array[1] = "six";
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("list: "+list);

        //对数组操作后,集合也会做相对应的改变
        list.set(2,"seven");//将下标2的元素修改为seven====明天将
        //改数组的同时改集合,该集合的时候改数组
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("list: "+list);


        //给集合添加或删除元素时,也要往在数组中添加或删除元素,会直接报错
        //因为数组长度固定,不会自动扩/缩容,运行时抛出不支持异常
        list.add("!!!!!");
    }
}
