package APIooday02;

/**
 *String replaceAll(String regex,String s):替换
 * 相当于当前字符串中满足正则表达式(regex)的部分替换为给定的字符串(s)
 */
public class ReplaceAllDemo {

    public static void main(String[] args) {
        String line = "17631238126";
        line = line.replaceAll("3123+","****");
        System.out.println(line);
    }
}
