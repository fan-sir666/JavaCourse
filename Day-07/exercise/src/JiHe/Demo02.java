package JiHe;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
        /*
         *  集合的操作:
         *       size: 获取集合的长度
         *       get(index):  获取集合中的某个元素
         *       add : 元素添加到集合的末尾，添加的元素要和定义集合的数据类型一致且符合该类型的范围
         *
         * */
        ArrayList<String> list1 = new ArrayList<>();

//        集合的元素添加

//        list1.add("张三");
//        System.out.println(list1);
//        System.out.println(list1.size());
//        list1.add("里斯");
//        System.out.println(list1.get(1);

//        集合的快速添加
        Collections.addAll(list1, "张三", "李四", "王五");
        System.out.println(list1);
    }
}
