public interface IQueue<E> {
//    判断是否为空
    boolean isEmpty();
//    获取长度
    int getSize();
//    入队
    void enqueue(E e);
//    出队
    E dequeue();
//    取队首
    E peek();
}
