package APIooday02;
//Integer的演示

/**
 * @author LZY
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //触发自动装箱类型,会被编译为:Integer i = Integer.valueOf(5)
        Integer i = 5;      //基本类型到包装类型--装箱


        //出发自动拆箱特性,会被编译为:int j = i.intValue();
        int j = i;          //包装类型到基本类型--拆箱

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("int的最大值为:"+max+",最小值为:"+min);

        long max1 = Integer.MAX_VALUE;
        long min1 = Integer.MIN_VALUE;
        System.out.println("long的最大值为:"+max1+",最小值为:"+min1);

        //2)包装类可以将字符串类型转换成对应的基本类型           必须熟练掌握
        String s1 = "23";
        int age = Integer.parseInt(s1);//将字符串s1转换为Int类型


        String s2 = "123.456";
        double price = Double.parseDouble(s2);//将字符串s2转换为double类型
        System.out.println(price);


        //将字符串s1转换为Int类型
        String s3 = "13";
        int money = Integer.parseInt(s3);
        System.out.println(s3);

        //将字符串s2转换为double类型
        String s4 = "13.2";
        double mile = Double.parseDouble(s4);
        System.out.println(s4);



        /*
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1 == i2); //false
        System.out.println(i1.equals(i2));//true


        //Integer.valueOf()会复用-128到127范围内的数值
        Integer i3 = Integer.valueOf(25);
        Integer i4 = Integer.valueOf(25);
        System.out.println(i3 == i4);//存在复用,所以相同
        System.out.println(i3.equals(i4));//相同,因为Integer类中重写了equals()的比较
         */
    }
}
