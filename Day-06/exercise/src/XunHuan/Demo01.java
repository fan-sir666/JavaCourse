package XunHuan;

public class Demo01 {
    public static void main(String[] args) {
        /*
        * 循环语句 for
        *
        *      语法: for (初始值; 循环条件; 步进) { 循环体 }
        *      注意: 循环内定义的变量  每次都会重新赋值  变量不会发生改变
        *
        * 循环语句 while
        *
        *  语法:
        *       循环初始值
        *       while (循环条件){ 循环代码  步进}
        *
        *
        * */

       /* for (int i = 1; i <=100 ; i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }*/


       /* int i = 1;
        while (i<=100){

            if (i %3 == 0) System.out.println(i);

            i++;
        }*/

/*//     倒叙打印
        for (int i = 100; i >= 1 ; i--) {
            System.out.println(i);
        }*/

/*//      无限循环  判断条件总是满足
//        for (;true;) {
//            System.out.println("无线循环");
//        }
//        while (true){
//            System.out.println("无线循环");
//        }*/


/*//      循环嵌套
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

    }
}
