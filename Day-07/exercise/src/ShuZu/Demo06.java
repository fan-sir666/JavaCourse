package ShuZu;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        /*
         *  数组反转
         *     循环次数  数组长度 / 2
         * */

        int[] arr = {11, 22, 33, 44, 55, 66};
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = arr[arr.length -i - 1];
//        }


//        优化代码  减少循环
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
