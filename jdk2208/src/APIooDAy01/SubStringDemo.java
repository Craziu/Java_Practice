package APIooDAy01;

public class SubStringDemo {
    public static void main(String[] args) {
         String str = "www.tedu.cn";
         int start = str.indexOf(".")+1;
         int end = str.indexOf("n");
         String name = str.substring(start,end);
        System.out.println(name);

        name = str.substring(4);
        System.out.println(name);
    }
}
