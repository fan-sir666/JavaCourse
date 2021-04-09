package ZiFuChuan.lianxiti;

public class Demo07 {
    public static void main(String[] args) {
//        定义一个方法run1，方法接收一个字符串，接收一个boolean值
//        boolean值为true，把字符串转为大写，返回
//        boolean值为false，把字符串转为小写，返回

        String str = "daFdsaWdsa";
        Boolean bole = false;
        String result = run1(bole, str);
        System.out.println(result);
    }

    public static String run1(Boolean bole, String str) {
        if (bole) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
//        bole ? return str.toUpperCase() : return str.toLowerCase();
    }
}
