/*
 *  使用链表实现线性表: 手写LinkedList
 *       1. 创建结点Node
 *           a: 元素E
 *           b: next 下一个节点
 *       2. 创建链表
 *           a: 头结点
 *           b：size 元素个数
 * */
public class LinkedList<E> {

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
    public LinkedList() {
        this.dummyHead = new Node();
        this.size = 0;
    }

    //    1. 获取元素个数
    public int getSize() {
        return size;
    }

    //    2. 是否为空 isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    //    3. 添加

    public void add(int index, E e) {
//        判断索引是否合法
        if (index < 0 || index > size) {
            throw new RuntimeException("索引非法");
        }

        Node cur = dummyHead;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Node newNode = new Node(e);
        newNode.next = cur.next;
        cur.next = newNode;

        size++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    //    4. 获取 通过索引
    public E get(int index) {
//      判断索引合法
        if (index < 0 || index > size) {
            throw new RuntimeException("索引非法");
        }
//      遍历查找元素
        Node cur = dummyHead;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
//      返回元素
        return cur.e;
    }

    //    5. 查找 通过元素 返回索引
    public int find(E e) {

        int index = -1;
        Node cur = dummyHead;
        for (int i = 0; i < size; i++) {
            cur = cur.next;
            if (cur.e != null &&cur.e.equals(e)) {
                return index = i;
            }
        }
        return index;
    }

    //    6. 包含 返回布尔值
    public boolean contains(E e) {
//        遍历比较
        Node cur = dummyHead;
//        for (int i = 0; i < size; i++) {
//            cur = cur.next;
//            if (cur.e != null && cur.e.equals(e)) return true;
//        }

//        cur.next.e 代表虚拟头结点的下一个元素
        while (cur.next != null) {
            if (cur.next.e.equals(e)) return true;
            cur = cur.next;
        }
//        返回结果
        return false;
    }


    @Override
    public String toString() {
        String str = "";
        Node cur = dummyHead.next;
        while (cur != null) {
            str += cur.e + "->";
            cur = cur.next;
        }
        str += "null";
        return str;
    }

}


