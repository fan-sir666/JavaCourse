public class Cs {
    public static void main(String[] args) {
        ArrayListLoopQueue<Integer> loopQueuelist = new ArrayListLoopQueue<>(5);
//        入队
        loopQueuelist.enqueue(10);
        loopQueuelist.enqueue(20);
        loopQueuelist.enqueue(30);
        loopQueuelist.enqueue(40);
        System.out.println(loopQueuelist);
        loopQueuelist.enqueue(50);
        System.out.println(loopQueuelist);
//        出队
        System.out.println(loopQueuelist.dequeue());
//        取
        System.out.println(loopQueuelist.peek());
    }
}
