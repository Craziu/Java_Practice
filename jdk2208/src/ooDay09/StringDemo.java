package ooDay09;

public class StringDemo {
    public static void main(String[] args) {
        /*
        使用字面量("")来创建字符串对象是时,JVM会自动检查常量池中是否有该对象
        1)若没有       -----创建字符串对象,并将其引用存入到常量池中
        2)若有         -----则直接将常量池中的对象(引用)返回--并不会创建新的字符串对象
         */
        String s1 = "123abc";       //常量池还没有,创建常量池,123abc为static fianl类型
        String s2 = "123abc";       //常量池存在,直接复用
        String s3 = "123abc";       //常量池存在,直接复用
        //引用类型==,比较的是地址是否相同---这是规定

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//true
        System.out.println(s2==s3);//ture

        s1 = s1 + "!";
        System.out.println(s1 == s2);
    }
}
