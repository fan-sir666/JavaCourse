package rongqicunchu.alist;

import java.util.ArrayList;
import java.util.Collections;

public class Cs {
    public static void main(String[] args) {
//        Person zs = new Person("张三", 18);
//        Person ls = new Person("李四", 18);
//        Person ww = new Person("王五", 18);

//        数组存储 自定义数组类型
//        ArrayList<Person> parr = new ArrayList<>();
//        Collections.addAll(parr,zs,ls,ww);
//
//        for (int i = 0; i < parr.size(); i++) {
//            System.out.println(parr.get(i).getPname());
//        }

//        简化
        ArrayList<Person> parr = new ArrayList<>();
        Collections.addAll(parr,
                new Person("张三", 18),
                new Person("李四", 18),
                new Person("王五", 18)
        );
        for (int i = 0; i < parr.size(); i++) {
            System.out.println(parr.get(i).getPname());
        }
    }
}
