public class LinkedListStack<E> implements IStack<E> {


    private LinkedList<E> linkedList;

    public LinkedListStack() {
        this.linkedList = new LinkedList<>();
    }

    //    快捷方式  在接口IStack<E>后面 alt+回车
    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void push(E e) {
//        选取链表的虚拟头结点这一端作为栈顶  时间复杂度为 O(1) 效率更高
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFrist();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
