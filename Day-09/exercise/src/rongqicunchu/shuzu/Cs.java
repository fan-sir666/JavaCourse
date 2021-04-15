package rongqicunchu.shuzu;

public class Cs {
    public static void main(String[] args) {
//        Person zs = new Person("张三", 18);
//        Person ls = new Person("李四", 18);
//        Person ww = new Person("王五", 18);

//        数组存储 自定义数组类型
//        Person[] parr = {zs, ls, ww};
//
//        for (int i = 0; i < parr.length; i++) {
//            System.out.println(parr[i].getPname());
//        }

//        简化
        Person[] parr = {
                new Person("张三", 18),
                new Person("李四", 18),
                new Person("王五", 18)
        };
        for (int i = 0; i < parr.length; i++) {
            System.out.println(parr[i].getPname());
        }
    }
}
