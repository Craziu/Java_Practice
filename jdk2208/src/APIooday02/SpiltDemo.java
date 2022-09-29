package APIooday02;

import java.util.Arrays;

/**
 * String[] spilt(String regex):拆分
 * 将当前字符串按照满足正则表达式(regex)的部分进行拆分
 */
public class SpiltDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String[] data = line.split("[0-9]+");//按数字拆分
        System.out.println(Arrays.toString(data));//将data数组转化为字符串

        line = "123.456.78";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));


        line = ".123.456..78...";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));
        System.out.println(data.length);

    }
}
