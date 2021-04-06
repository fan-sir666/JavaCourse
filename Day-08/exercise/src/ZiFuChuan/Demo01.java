package ZiFuChuan;


public class Demo01 {
    public static void main(String[] args) {
        /*
         *  字符串：代表一个字符序列，其底层为字符数组。
         *
         * */

//        创建方式

//        String str1 = new String("java"); // 完整

//        String str2 = "java"; // 快捷

//        char数组形式创建字符串
        char[] arr = {'h', 'e', 'l', 'l', 'o'};

//        String str1 = new String(arr);
//        System.out.println(str1);

//        将char数组 截取指定长度变为字符串
        String str1 = new String(arr, 1, 3);
        System.out.println(str1);   //ell

//        小结：
//        1、若仅需要对字符串进行创建保存：  String 变量名="值";
//        2、若需要将字符数组转为字符串：  new String(char[] value);
//        3、若需要将字符数组指定长度变为字符串： new String(char[] value,int offset,int count);
//        4、创建新对象：new String("");

    }
}
