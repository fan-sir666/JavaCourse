public class ArrayListStack<E> implements IStack<E> {
    //    1.引入顺序表
    private Array<E> array;

//    2.初始化栈

    public ArrayListStack() {
        array = new Array<>();
    }
//    3. 设置数组容量
    public ArrayListStack(int capacity) {
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
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
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
