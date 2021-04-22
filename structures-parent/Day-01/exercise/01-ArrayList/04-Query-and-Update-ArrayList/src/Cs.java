public class Cs {
    public static void main(String[] args) {
//      创建数组
//        添加
        Array arr = new Array();
        arr.add(0,11);
        System.out.println(arr.toString());
        arr.addFirst(22);
        System.out.println(arr.toString());
        arr.addLast(55);
        System.out.println(arr.toString());
//        [22,11,55,0,0,0,0,0,0,0]

//        获取
        System.out.println(arr.get(1));
//        查找
        System.out.println(arr.find(11));
//        修改
        arr.set(1,55);
        System.out.println(arr.toString());


//
    }
}
