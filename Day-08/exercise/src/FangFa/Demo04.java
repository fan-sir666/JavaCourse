package FangFa;

import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args) {
/*//        查找元素
        int[] arr = {1,2,3,4,5,66,7};
        int index = getIndex(arr,66);
        System.out.println(index);*/

        int[] arr = {123, 10, 137, 49, 361, 51};
        ArrayList<Integer> result = searchAndSave(arr);
        System.out.println(result);
    }

    /*
     *  查找元素
     * */
    public static int getIndex(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> searchAndSave(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            int bai = arr[i] / 100 % 10;
            if (ge != 3 && shi != 3 && bai != 3) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
