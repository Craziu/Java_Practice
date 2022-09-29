package APIooDAy01;

public class StringDemo {
    public static void main(String[] args) {
        /*
        常见面试题
        String s = new String("hello");
        创建了两个对象,第一个"hello"
            --java会创建一个String对象表示字面量"hello",并将其存入常量池中
        第二个String对象"hello"




         */
        String s = new String("Hello");
        String s1 = "hello";
        System.out.println("s" + s);
        System.out.println("s1" + s1);
        System.out.println(s==s1);

        System.out.println(s.equals(s1));
        //String在比较相等的时候一般都是比较字符串内容是否相等
        //因此需要使用equals()方法来比较l两个字符串的内容是否相同












        /*
        String s1 = "123abc";           //在堆中创建123abc字面量对象
        //编译器在编译时,若发现是两个字面量相连,则会直接连接好并将结果保存起来
        //如下语句相当于:String s3 = "123abc";
        String s2 = "123"+"abc";

        System.out.println(s1 == s2);   //true

        String s3 = "123";
        //因为s3是一个变量,素以在编译期不会直接编译好
        String s4 = s3+"abc";//创建一个人新的对象储存123abc
        System.out.println(s1 == s4);//false
        */
    }
}
