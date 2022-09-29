package APIooDAy01;

public class indexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        int index = str.indexOf("in");      //检索in在str中第一次出现的位置
        System.out.println(index);

        index = str.indexOf("in",3);
        System.out.println(index);

        index = str.indexOf("abc");
        System.out.println(index);  //-1
        index = str.lastIndexOf("in");
        System.out.println(index);
    }
}
