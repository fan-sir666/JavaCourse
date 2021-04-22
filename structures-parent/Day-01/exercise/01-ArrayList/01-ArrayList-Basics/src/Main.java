public class Main {
    public static void main(String[] args) {
//        知识回顾
//        1.数组的创建方式
//        方式一 标准型
        int[] arr1 = new int[10];
//        方式二 完整型
        int[] arr2 = new int[]{1,2,3};
//        方式三 简化型
        int[] arr3 = {1,2,3};

//        2.数组的遍历
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }
//        增强for循环
        for (int num : arr2) {
            System.out.println(num);
        }

//        删除数组中的元素(忽略端点元素)
//        for (int i = 0; i < arr2.length; i++) {
//            // 删除元素后面的元素向前面进一位
//            arr2[i] = arr2[i+1];
//        }
    }
}
