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

//        包含
        System.out.println(arr.contains(55));
//       删除
        System.out.println(arr.removeLast());
    }
}
