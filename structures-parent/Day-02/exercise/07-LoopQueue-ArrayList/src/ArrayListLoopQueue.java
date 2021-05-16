public class ArrayListLoopQueue<E> implements ILoopQueue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public ArrayListLoopQueue() {
        this(10);
    }

    public ArrayListLoopQueue(int capacity) {
        this.data = (E[]) new Object[capacity];
        front = 0;
        tail = 0;
        size = 0;
    }

    public void resize(int newCapacity) {
//        创建新数组
        E[] newData = (E[]) new Object[newCapacity];
//       挪  newData[i] = oldData[(i+front)%data.length]
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
//       出队front 改变位置 也从新数组的0开始
        front = 0;
//       入队tail 位置变为size的位置
        tail = size;
//        新覆盖旧的数组
        data = newData;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e) {
//        判断是否需要扩容
        if ((tail + 1) % data.length == front) {
            resize(data.length * 2);
        }
//        向数组中添加元素
        data[tail] = e;
//        维护 tall
        tail = (tail + 1) % data.length;
//        维护size
        size++;
    }

    @Override
    public E dequeue() {
//        判断是否为空
        if (size == 0) {
            throw new RuntimeException("队列为空,无元素出队");
        }
//        保存出队元素
        E del = data[front];
//        维护front
        front = (front+1)%data.length;
//        维护size
        size--;
//        是否需要缩容
        if (size==data.length/4 && data.length/2>=10){
            resize(data.length/2);
        }
        return del;
    }

    @Override
    public E peek() {
        return data[front];
    }

    @Override
    public String toString() {
        String str = "";
        str += "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
            if (i != data.length - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
