package ZiFuChuan.lianxiti;

public class Demo05 {
    public static void main(String[] args) {
        /*
         *  练习题
         *
         * */
//        已知字符串aabbccAABBCC
//        需要将所有除了字母a或A 以外的所有字母都转为大写，返回一个新字符串
//        例如：aaBBCCAABBCC


        String str = "aabbccAABBCC";
        String result = run(str);
        System.out.println(result);
    }

    //    public static String run(String str) {
//        String newstr = new String();
//        char[] arr = str.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 'a' || arr[i] == 'A'){
//                newstr += arr[i];
//                continue;
//            }
//            newstr += (arr[i] + "").toUpperCase();
//        }
//        return newstr;
//    }
    public static String run(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'a' && arr[i] != 'A') {
                String temp = (arr[i] + "").toUpperCase();
                arr[i] = temp.charAt(0);
            }
        }
        return new String(arr);
    }
}
