package APIooDAy01;
//String和StringStringBuilderDemo的演示
//String不适合频繁修改内容操作,效率特别低
/*StringBuilder是专门用于修改字符串的一个类,内部维护以恶可变的char数组,
    所有操作是在这个数组的基础之上进行的,修改速度快,性能优秀
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习JAVA";
        //复制str的内容到builder中
        StringBuilder builder = new StringBuilder(str);

        //append():追加内容   ----在末尾追加
        builder.append(",为了找个好工作");
        System.out.println(builder);


        //replace():替换部分内容(含头不含尾)
        //将下标9到15的内容替换为--------------就是为了改变世界
        builder.replace(8,15,"就是为了改变世界");
        System.out.println(builder);




        //delete():删除部分内容(含头不含尾)
        builder.delete(0,8);//删除0到7的
        System.out.println(builder);


        //insert():插入内容
        builder.insert(0,"活着");     //在下标为0的地方插入活着
        System.out.println(builder);

        StringBuilder s = new StringBuilder("a");
        for(int i = 0; i < 10000000; i ++){
            s.append(i);
        }
        System.out.println("执行完毕");

        /*
        StringBuilder builder1 = new StringBuilder();

        StringBuilder builder2 = new StringBuilder("abc");
        //基于String来创建StringBulider
        String str = "abc";
        StringBuilder builder3 = new StringBuilder(str);
        String str2 = builder3.toString();
        */
    }
}
