public class LinkedListLoopQueue<E> implements ILoopQueue<E> {
    //    使用内部类创建结点
    private class Node {
        public E e;
        public Node next;

        public Node() {
        }

        public Node(E e) {
            this.e = e;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    //    头结点
    private Node dummyHead;
    //    size 链表元素的个数
    private int size;

    //    初始化
    public LinkedListLoopQueue() {
        this.dummyHead = new Node();
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e) {
//        判断是否为空
        if (size == 0) {
            dummyHead.next = new Node(e, dummyHead);
            size++;
        } else {
            Node tailNode = dummyHead;
            for (int i = 0; i < size; i++) {
                tailNode = tailNode.next;
            }
            tailNode.next = new Node(e, dummyHead);
            size++;
        }
    }

    @Override
    public E dequeue() {
        if (size == 0) {
            throw new RuntimeException("无元素出队");
        }
//        出队元素
        Node delNode = dummyHead.next;
//        元素出队后改变指向
        dummyHead.next = delNode.next;
//        维护size
        size--;
//        返回元素
        return delNode.e;
    }

    @Override
    public E peek() {
        return dummyHead.next.e;
    }

    @Override
    public String toString() {
        String str = "";
        Node cur = dummyHead.next;
        for (int i = 0;i<size;i++){
            str += cur.e + "->";
            cur = cur.next;
        }
        return str;
    }


}
