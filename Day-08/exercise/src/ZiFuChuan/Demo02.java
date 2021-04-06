package ZiFuChuan;

public class Demo02 {
    public static void main(String[] args) {
        /*
         *
         *  字符串的相关方法
         *
         * */

//        判断方法 返回布尔值

        String str = "helloWorld";

//      startsWith 是否以 xx 开头
        System.out.println(str.startsWith("hello"));

//      endsWith 是否以 xx 结尾
        System.out.println(str.endsWith("world"));

//      contains 是否包含 xx 字符串
        System.out.println(str.contains("wo"));

//      equals 是否与指定内容相等
        System.out.println(str.equals("helloworld"));

//      equalsIgnoreCase 是否与指定内容相等 (忽略大小写)
        System.out.println(str.equalsIgnoreCase("helloworld"));

//      isEmpty 当前字符串是否为空 true表示空
        System.out.println(str.isEmpty());
    }
}
