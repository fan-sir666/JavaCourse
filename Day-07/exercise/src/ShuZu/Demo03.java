package ShuZu;

public class Demo03 {
    public static void main(String[] args) {
        /*
        *  数组的遍历
        *
        * */

        int[] arr = new int[] {11,22,33,44,55};

//        正序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("******************************");

//        倒序
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
