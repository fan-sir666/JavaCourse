package jihejinjie.lianbiao;

import java.util.LinkedList;

public class Demo02 {
    public static void main(String[] args) {
        /*
        *   LinkedList: 链表 (没有索引)  操作元素 的头&尾
        *
        *       元素之间 ：双向链表
        *
        * */

//        定义
        LinkedList<String> list = new LinkedList<>();

//        添加  addFirst 头 addLast 尾
        list.addFirst("aa");
        list.addLast("bb");
//        System.out.println(list);


//        获取
        System.out.println(list.getFirst()); // aa
        System.out.println(list.getLast());  // bb

//        删除

        String s1 = list.removeFirst();
        String s2 = list.removeLast();
//        System.out.println(s1);
//        System.out.println(s2);
    }
}
