package jihejinjie;


import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        /*
         *   集合：用来保存 相同类型数据 的容器，除了保存数据，又集成了较多强大功
         *       ArrayList、LinkedList、HashSet、HashMap
         * */

//    ArrayList 的方法

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3);
//        System.out.println(list);

//        获取长度 size
//        System.out.println(list.size());

//        获取元素
//        System.out.println(list.get(1)); // 2

//        添加元素

//        System.out.println(list.add(5)); // 将元素天机到末尾 直接打印true 表示成功
//        list.add(2,88);
//        System.out.println(list); // 将元素添加到指定位置  参数① 目标位置的索引 ② 要添加的元素

//        删除元素
//        int num = list.remove(1); // 返回删除的元素
//        System.out.println(num);


//        增强for循环 集合名.for
        for (Integer integer : list) {
            System.out.println(integer);
        }

//      注意:只能正向遍历，不可以在遍历中进行元素增删操作。
    }
}
