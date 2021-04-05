package FangFa;

public class Demo01 {
    public static void main(String[] args) {
        /*
         *  函数：
         *     方法名采用小驼峰
         *     void 代表无返回值 放在函数名的前面  有返回值时需要指定 返回值类型
         *     参数列表  定义在() 中 称为形参  不能用=号赋值
         *
         * */

//      普通调用
        int result = Demo01.getSum(10,20);
        System.out.println(result);
//      本类调用忽略类名

//        getSum(10,20);
    }

    public static int getSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

}
