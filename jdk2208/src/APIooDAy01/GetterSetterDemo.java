package APIooDAy01;

import java.lang.ref.SoftReference;

public class GetterSetterDemo {
    /*

     */
    public static void main(String[] args) {
       Piont p1 = new Piont(100,200);
       Piont p2 = new Piont(100,200);
        System.out.println(p1 == p2);//false,比较的是地址
        //因为Point累重写了equals()方法
        //所以雌畜调用的是重写之后的equals()方法,比较的是属性的值是否相同
        System.out.println(p1.equals(p2));//true


        String s1 = new String("hello");
        String s2 = new String("hello");
        StringBuilder builder1 = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");
        //StringBulider类没有重写equals(),因此调用的还是Object类的equals().比较的还是地址
        System.out.println(builder1.equals(builder2));//false
        System.out.println(s1.equals(builder1));      //false



















        /*
        Piont p = new Piont(100,200);
        p.setX(100);
        p.setY(100);
        System.out.println(p.getX()+","+p.getY());

         */
    }
}
