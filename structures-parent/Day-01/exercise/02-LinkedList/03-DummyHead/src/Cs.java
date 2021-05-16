public class Cs {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(10);
        System.out.println(list.toString());
        list.addFirst(22);
        list.addLast(88);
        System.out.println(list.toString());
        list.add(2,55);
        System.out.println(list.toString());
    }
}
