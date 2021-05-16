public interface IStack<E> {
//    判断是否为空
    boolean isEmpty();
//    获取长度
    int getSize();
//    压栈
    void push(E e);
//    出栈
    E pop();
//    取栈顶元素
    E peek();
}
