package jihejinjie.bucunfu;

import java.util.Collections;
import java.util.HashSet;

public class Demo04 {
    public static void main(String[] args) {
        /*
        *  HashSet (无索引) 存储元素不重复
        *
        * */

//        定义
        HashSet<String> list = new HashSet<>();

//        添加  保存元素的顺序 依照 abcde 的顺序
//        list.add("官呈达");
//        list.add("袁旭东");
//        list.add("范志伟");
//        System.out.println(list);

        Collections.addAll(list,"aa","bb","cc");
//        System.out.println(list);
//        System.out.println(list.add("bb")); // false 添加重复元素失败 返回布尔值

//        元素个数
//        System.out.println(list.size());

//        判断集合是否为空
//        System.out.println(list.isEmpty());

//        移除
        System.out.println(list.remove("bb")); // true
//        清空
        list.clear();
        System.out.println(list);

//        遍历
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
