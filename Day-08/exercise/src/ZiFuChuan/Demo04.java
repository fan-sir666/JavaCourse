package ZiFuChuan;

public class Demo04 {
    public static void main(String[] args) {
        /*
         *
         *  字符串的相关方法
         *
         * */

//        查找方法
        String str = "FanZhiWei";

//        charAt返回指定索引字符
        System.out.println(str.charAt(3));
//        寻找指定字符串 参数: ① 要找的字符串 ②寻找的起始位置 ③ 未找到返回-1
        System.out.println(str.indexOf("Zhi")); // 3


//        其他方法

//        获取字符串长度
        System.out.println(str.length());
//        比较两个字符串的大小 compareTo  返回:正数(str1大) 0 (一样大) 负数 (str2大)
        String str1 = "abc", str2 = "def";
        System.out.println(str1.compareTo(str2));
//        字符串拼接 concat
        System.out.println(str1.concat(str2));
    }
}
