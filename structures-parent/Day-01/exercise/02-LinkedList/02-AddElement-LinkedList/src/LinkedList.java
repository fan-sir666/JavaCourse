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
    private Node head;
    //    size 链表元素的个数
    private int size;


    //    1. 获取元素个数
    public int getSize() {
        return size;
    }

    //    2. 是否为空 isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    //    3. 添加

    public void addFirst(E e){
//        1.创
        Node newNode = new Node(e);
//        2.连
        newNode.next = head;
//        3.变
        head = newNode;
        size++;
    }


    public void add(int index,E e){
//        判断索引是否合法
        if (index < 0 || index >size){
            throw new RuntimeException("索引非法");
        }



        if (index == 0){
            addFirst(e);
        }else {
            Node cur = head;
            for (int i = 1; i < index; i++) {
                cur = cur.next;
            }
            Node newNode = new Node(e);
            newNode.next = cur.next;
            cur.next = newNode;

            size ++;
        }
    }

    public void addLast(E e){
        add(size,e);
    }

    @Override
    public String toString(){
        String str = "";
        Node cur = head;
        while (cur != null){
            str += cur.e + "->";
            cur = cur.next;
        }
        str += "null";
        return str;
    }

}


