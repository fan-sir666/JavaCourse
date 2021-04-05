package JiHe;

import java.util.ArrayList;
import java.util.Collections;

public class Demo04 {
    public static void main(String[] args) {
        /*
         * 练习题 ：求和  最值  元素的查找
         * */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 22, 33, 44, 55, 66);

//        求和
//        int sum = 0;
//
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        System.out.println(sum);

//        求平均值(注意小数位丢失的问题)

//        double avg = 1.0 * sum / list.size();
//        System.out.println(avg);

//        求最值

//        int max = list.get(0), min = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
////            最大值
//            if (max < list.get(i)) {
//                max = list.get(i);
//            }
////            最小值
//            if (min > list.get(i)) {
//                min = list.get(i);
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

//        元素查找
//        int findnum = 22, index = -1;
//        for (int i = 0; i < list.size(); i++) {
//            if (findnum == list.get(i)) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index != -1 ? "元素:"+findnum+"索引:"+index:"未找到元素" + findnum);
    }
}
