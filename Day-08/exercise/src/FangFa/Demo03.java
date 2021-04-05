package FangFa;


public class Demo03 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        求和
        int sum = getSum(arr);
        System.out.println(sum);
//        倍数求和
        int sumresult = getSumBei(arr);
        System.out.println(sumresult);
    }

    /*
     * 数组 元素偶数 求和函数
     * */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /*
     * 数组 元素倍数 求和 函数
     * */
    public static int getSumBei(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
