public class Cs {
    public static void main(String[] args) {
        LinkedListLoopQueue<Integer> list = new LinkedListLoopQueue<>();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        System.out.println(list);
//        出队
        System.out.println(list.dequeue());
//        取
        System.out.println(list.peek());
    }
}
