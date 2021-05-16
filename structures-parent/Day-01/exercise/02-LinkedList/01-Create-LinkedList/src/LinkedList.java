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

}


