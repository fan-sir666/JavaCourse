public class LinkedListQueue<E> implements IQueue<E>{
    private LinkedList<E> linkedList;

    public LinkedListQueue() {
        this.linkedList = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void enqueue(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E dequeue() {
        return linkedList.removeLast();
    }

    @Override
    public E peek() {
        return linkedList.getLast();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
