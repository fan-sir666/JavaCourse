package jihejinjie.lianbiao;

import java.util.Collections;
import java.util.LinkedList;

public class Demo03 {
    public static void main(String[] args) {


//      没有元素的时候  获取和删除操作会报错

        LinkedList<String> list = new LinkedList<>();

        Collections.addAll(list,"aa","bb","cc");

        System.out.println(list.size());

//        遍历
        for (String s : list) {
            System.out.println(s);
        }

//        LinkedList 支持 ArrayList的操作方法 ，但由于底层没有索引  模拟索引完成操作 效率低不建议使用。
    }
}
