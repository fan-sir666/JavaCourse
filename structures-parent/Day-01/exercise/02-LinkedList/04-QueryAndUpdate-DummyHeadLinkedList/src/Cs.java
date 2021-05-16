public class Cs {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(10);
//        System.out.println(list.toString());
        list.addFirst(22);
        list.addLast(88);
//        System.out.println(list.toString());
        list.add(2,55);
        System.out.println(list.toString());

//        获取
        System.out.println(list.get(2));
//        查找
        System.out.println(list.find(10));
        System.out.println(list.find(100));

//        包含
        System.out.println(list.contains(10));
        System.out.println(list.contains(100));
    }
}
