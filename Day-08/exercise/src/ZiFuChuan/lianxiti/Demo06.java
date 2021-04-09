package ZiFuChuan.lianxiti;

public class Demo06 {
    public static void main(String[] args) {
//        定义一个方法run2，方法接收一个字符串（纯字母组成），方法中统计有多少个字母a   并返回结果。
        String str = "adadada";
        int result = run2(str);
        System.out.println(result);
    }
    public static int run2(String str){
        // 声明计数初始值0
        int c = 0;
        // 将字符串变为char 数组进行遍历判断
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a'){
                c++;
            }
        }
        return c;
    }
}
