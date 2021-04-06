package ZiFuChuan;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        /*
         *
         *  字符串的相关方法
         *
         * */

//        转换

        String str1 = "  java,javaScript  ";
//        String str1 = "javaScript";

//        去除两端空格
        System.out.println(str1.trim());
//        转成大写
        System.out.println(str1.toUpperCase());
//        转成小写
        System.out.println(str1.toLowerCase());
//        截取 根据索引 空格也算  substring(start,end) 包含开始不包含结束
        System.out.println(str1.substring(4));
//        替换
        System.out.println(str1.replace(',', '.'));
//        变为字符串
        char[] arr = {'l', 'o', 'v', 'e'};
        System.out.println(Arrays.toString(arr)); // 返回字符串数组 [l, o, v, e]
        System.out.println(new String(arr)); // love
//        toCharArray变为字符数组
        char[] arr1 = str1.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println("\n");
//        切割split
        System.out.println(Arrays.toString(str1.trim().split(",")));
    }
}
