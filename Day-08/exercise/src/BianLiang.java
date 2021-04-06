public class BianLiang {
//    public static void main(String[] args) {
    /*
     *  局部和成员变量 ：根据作用域范围区分
     * */

//    }
//    成员变量 （定义在方法外、类中的变量; 在改类的任意位置有效）
//    绕开就近原则的 直属调用： 类名.成员变量名
//    static int b = 20;

//    public static void run(){
//        // 局部变量 仅在方法内部可用，形参也是一种局部变量
//        int a = 10;
//        System.out.println(a);
//    }


//    练习题

    /*static int num = 0;

    public static void main(String[] args) {
        int num = 1;
        num++; // 局部 2

        run1(num);
        run1(BianLiang.num++); // ++ 之后成员变量 1

        System.out.println(num); // 2
        System.out.println(BianLiang.num); // 1
    }

    public static void run1(int num) {
        num++;// 改方法内部的形参 num 1
    }*/

   /* static int num = 0;

    public static void main(String[] args) {
        int num = 1;
        num++; // 局部 2
        num = run1(BianLiang.num++); // 成员变量 1 返回值 1 赋值给局部变量num

        System.out.println(num); // 1
        System.out.println(BianLiang.num); // 1
    }
    public static int run1(int num){
        return BianLiang.num+=num++;
    }*/
}
