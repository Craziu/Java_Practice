package APIooDay03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环=====新循环====jdk1.5推出的一个特性,也叫做新循环,让我们使用相同的语法遍历集合和数组
 *         方法:for(元素类型 变量名 : 结合或数组){
 *            循环体
 *         }
 *
 *         易错点:
 *         数组会先事先定义好,但是集合里面的数据时object类型,即各种类型数据都可能出现,要做强转;
 *
 *         Collection<E>中的E指的是泛型=======jdk1.5是推出的特性,叫做泛型
 *         泛型也叫参数化类型,允许我们在使用一个类时,传入某个类型来规定其内部得属性,方法,参数,返回值类型,使我们使用的时候更加方便
 *         即:统一规则的方法.
 *         泛型<E>在即和张被广泛使用,用来指定集合元素得类型
 *         若不指定,则默认为Object,获取泛型的值时要进行强转(不用泛型)
 *         若指定泛型的具体类型,在获取泛型的值时,编译器会自动转移(补充强转操作)
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i = 0 ; i < array.length ; i ++){
            System.out.println(array[i]);
        }
        //增强型for循环(新循环遍历数组
        /**for(元素类型 变量名 : 结合或数组){
          *  循环体
        }*/
        for(String str : array){
            System.out.println(str);//每个元素都是数组中的的
        }


        Collection c = new ArrayList(); //利用迭代器创建集合,实现新循环=====既能遍历数组,也可以遍历循环
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator it = c.iterator();//创建迭代器
        while (it.hasNext()){
            String next = (String)it.next();
            System.out.println(c);
        }
        //新循环遍历集合====会被编译器改回迭代器遍历
        for(Object obj : c){
            String str = (String) obj;//强制类型转换
            System.out.println(str);//每个元素都是c中的(因为强制类型转换,所以是str)
        }

    }
}
