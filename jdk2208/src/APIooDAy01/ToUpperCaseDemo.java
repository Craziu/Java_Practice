package APIooDAy01;

/**
 * String ToUpperCase
 * 将当前字符串长得英文部分给转换为全大写
 * String ToLowUpperCase
 * 将当前字符串长得英文部分给转换为全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java!";
        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);
    }
}
