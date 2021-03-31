package XunHuan;

public class LianXi {
    public static void main(String[] args) {
//        思考案例1：要求，每次展示一个*，用for展示如下效果 （不能用if）
//	*
//	**
//	***
//	****

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

/*        String s = "";
        for (int i = 0; i < 4; i++) {
            s += "*";
            System.out.println(s);
        }*/

//      思考案例2：要求，每次展示一个*，用for展示如下效果 （不能用if）
//	****
//	***
//	**
//	*

//        for (int i = 0; i < 4; i++) {
//            for (int j = 4; j > i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//        int i = 1;
//        for (; i <= 3; i++) {
//        }
//        System.out.println(i); // 循环完毕 输出4


//        for (int i = 1; i <=3 ; i++) {
//        }
//        System.out.println(i); // 报错 外部访问不到循环内部变量


//        for (int i = 1; i <=3 ; i++) {
////            for (int j = 1; j <=3 ; j++) {
////
////            }
////            System.out.println(j);
////        }
////        System.out.println(i); // 同上


//         循环 3次  变量可以访问  每次都输出内层循环结束后的结果4
//        int j = 1;
//        for (int i = 1; i <=3 ; i++) {
//            for (; j <=3 ; j++) {
//
//            }
//            System.out.println(j);
//        }


/*        // 1  a 11  2 a 12

        for(int i=1;i<=2;i++){
            int a = 10;
            a+=i;
            System.out.println(a);
        }*/

/*//      1 a 11  3 a 13
        for(int i=1;i<=4;i+=2){
            int a = 10;
            a+=i;
            System.out.println(a);
        }*/

/*
//      1 a 11 2  a 13
        int a = 10;
        for(int i=1;i<=2;i++){
            a+=i;
            System.out.println(a);
        }
*/

/*//       1 a 11 3 14
        int a = 10;
        for(int i=1;i<=4;i+=2){
            a+=i;
            System.out.println(a);
        }*/


// 九九乘法表

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j + "*" + i + "=" + i * j+"\t");
            }
            System.out.println("\n");

        }
    }
}
