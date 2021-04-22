package jihejinjie.lianxiti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Lx {
    public static void main(String[] args) {
        /*定义一个整数数组
        int[] arr = {11,22,33,44,55,33,22,11};
        使用HashSet集合取出数组中重复的数字，并将重复数字保存到一个ArrayList集合中。*/

        int[] arr = {11,22,33,44,55,33,22,11};
/*        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // 遍历数组 将元素添加到 set集合
        for (int i : arr) {
//          set集合  add 方法添加失败返回false
            if(!set.add(i)){
                // 重复元素走进判断 添加到list集合
                list.add(i);
            }
        }
        System.out.println(list);*/

//        使用HashMap集合统计每个元素的出现次数 ?

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            Integer value = map.get(i);
//            判断 value 是否为null
            if(value != null){
                map.put(i,value+1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
