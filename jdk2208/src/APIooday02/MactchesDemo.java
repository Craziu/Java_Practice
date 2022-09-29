package APIooday02;

import java.lang.ref.SoftReference;

/**
 * boolean matches(String regex):匹配
 * 使用给定的正则表达式(regex)验证当前字符串是否符合要求,若符合返回ture,不符合返回false
 */

public class MactchesDemo {
    public static void main(String[] args) {
        /*
            邮箱的正则表达式:
            [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
            注意:"\."中的\是正则表达式中的转义符
                "\\."中的第一个\是转译正则表达式中的\
         */
        String email = "wangkiji@tedu.cn";
        String email1 = "m123121@13121.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        //使用regex匹配email是否复合格式要求
        boolean match = email.matches(regex);
        //matches的用法:对象.matchex(判定方法)
        if(match){
            System.out.println("正确的");
        }else{
            System.out.println("错误的");
        }
    }
}
