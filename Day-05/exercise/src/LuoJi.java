public class LuoJi {
    public static void main(String[] args) {
        /*
         *   逻辑运算符      &       |        ！                ^（异或）                  &&  （短路与）         ||（短路或）
         *
         *             一假则假   一真则真    取反      两端值相同false,不相同true     式子出了结果：后面不执行
         *
         * */

        /*int a = 10;
        int b = 20;
        boolean c = (a > 10) && (b >= 20);
        System.out.println(c); // false*/


/*        int a = 10;
        int b = 20;
        a += 5; // 15
        b -= 10; // 10
        boolean c = (a > 10) && (b >= 20);
        System.out.println(a); // 15
        System.out.println(b);  // 10
        System.out.println(c);  // false*/


       /* int a = 10;
        int b = 20;
        a += 5;  // 15
        b -= 10;    // 10
        boolean c = (a > 10) || (b >= 20);
        System.out.println(a); // 15
        System.out.println(b);  // 10
        System.out.println(c);  // true*/


       /* int a = 10;  // 11 12   13
        int b = 11;  // 12  11  13
        System.out.println( a++==10 && ++b>=11); // true
        System.out.println( ++a==b-- || b++>=a-- || ++a>13 || b--<12 || (b=13)>(a=12)); // true
        System.out.println( a++==++b && (b=13)!=a && (a=13)!=b); // false
        System.out.println(a); // 13
        System.out.println(b); // 13*/


      /*  int a = 1;  // 2
        int b = 1;  // 2
        boolean c = (a++ + ++b > 5) && (b >= a) && (b++ == a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); // false*/



/*        int a = 1;  // 2    3
        int b = 1;  // 2 3  4

//      先算 && 再算 ||
//                                       1      2 true   2      2 true
//                    2      3    false          true 这里决定结果
        boolean c = (a++ + ++b > 5) || (b++ <= ++a) && (b++ == a);
        System.out.println(a); // 3
        System.out.println(b); // 4
        System.out.println(c); // true*/

    }
}
