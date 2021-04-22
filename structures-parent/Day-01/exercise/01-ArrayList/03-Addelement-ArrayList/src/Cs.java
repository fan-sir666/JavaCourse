public class Cs {
    public static void main(String[] args) {
//      创建数组
        Array arr = new Array();
        arr.add(0,11);
        System.out.println(arr.toString());
        arr.addFirst(22);
        System.out.println(arr.toString());
        arr.addLast(55);
        System.out.println(arr.toString());
    }
}
