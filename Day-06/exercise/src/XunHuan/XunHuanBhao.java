package XunHuan;

public class XunHuanBhao {
    public static void main(String[] args) {
        /*
         *  循环标号: 就是给循环起标号，结合 break continue 关键字一起使用
         *
         * */

        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("*");
                // 直接可以结束外层循环
                break outer;
            }
        }
    }
}
