package JiHe;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        /*
         *  集合的遍历
         * */

        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add("哈哈" + i);
        }
//        System.out.println(list1);
        
//        正向遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("----------------------");
        
//        倒叙遍历
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.println(list1.get(i));
        }
    }
}
