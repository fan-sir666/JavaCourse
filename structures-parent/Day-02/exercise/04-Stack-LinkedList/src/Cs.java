public class Cs {
    public static void main(String[] args) {
        LinkedListStack<Integer> listStack = new LinkedListStack<>();
//        压栈
        listStack.push(11);
        listStack.push(12);
        listStack.push(13);
        System.out.println(listStack);

//        出栈
        System.out.println(listStack.pop());
//        取
        System.out.println(listStack.peek());
    }
}
