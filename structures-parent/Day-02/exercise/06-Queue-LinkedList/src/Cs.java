public class Cs {
    public static void main(String[] args) {
        LinkedListQueue<Integer> listQueue = new LinkedListQueue<>();
//        入队
        listQueue.enqueue(10);
        listQueue.enqueue(20);
        listQueue.enqueue(30);
        System.out.println(listQueue);
//        出队
        System.out.println(listQueue.dequeue());
//        取首
        System.out.println(listQueue.peek());
    }
}
