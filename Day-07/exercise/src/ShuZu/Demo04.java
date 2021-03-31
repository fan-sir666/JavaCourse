package ShuZu;

public class Demo04 {
    public static void main(String[] args) {
        /*
        *  变量值交换
        *
        *       方式: 声明第三方变量 tamp
        *             求和做差法
        * */

        int num1 = 10,num2 = 20;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
