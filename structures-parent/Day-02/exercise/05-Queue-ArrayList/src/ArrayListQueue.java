public class ArrayListQueue<E> implements IQueue<E>{
    private Array<E> array;

    public ArrayListQueue() {
        this.array = new Array<>();
    }

    public ArrayListQueue(int capacity) {
        this.array = new Array<>(capacity);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public void enqueue(E e) {
        array.addFirst(e);
    }

    @Override
    public E dequeue() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
