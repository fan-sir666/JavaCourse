package XunHuan;

public class GuanJianZi {
    public static void main(String[] args) {
        /*
         *  关键字
         *       break: 结束当前循环  放在循环体内
         *
         *       continue: 跳出本次循环
         *
         * */
  /*      int c = 1;
        for (int i = 1; i <= 100; i++) {
            if (c>3){
                break;
            }
            if (i % 17 == 0) {
                System.out.println(i);
                c++;
            }
        }*/

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
