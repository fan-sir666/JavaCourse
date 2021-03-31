package ShuZu;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        /*
        *  冒泡排序  : 外层控制轮数  内层控制次数
        *       轮数     数组长度 - 1
        *
        *       比较次数  数组长度 - i
        * */

        int[] arr = {45,58,21,63,66};

//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i; j++) {
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        System.out.println(Arrays.toString(arr));

    }
}
