package ShuZu;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        /*
        *  选择排序:
        *       外层控制选择索引
        *       内层控制对比索引
        *
        * */
        int[] arr = {11,55,44,85,36,25};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
