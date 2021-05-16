public class Cs {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        System.out.println(list.toString());

        list.addFirst(8);
        System.out.println(list.toString());

        list.add(1,55);
        System.out.println(list.toString());
        list.add(1,22);
        System.out.println(list.toString());
        list.addLast(100);
        System.out.println(list.toString());
    }
}
