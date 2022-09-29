package APIooDAy01;

/**
 * boolean statrsWith(String s);
 * 判断当前字符串是否是以给定的字符串(s)开始的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "thinking in Java";
        boolean starts = str.startsWith("think");//判断str是否以think开头
        System.out.println(starts);

        boolean ends = str.endsWith(".png");//判断str是否以.png结尾
        System.out.println(ends);
    }
}
