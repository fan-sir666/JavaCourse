public class Cs {
    public static void main(String[] args) {
//        创建实例
        ArrayListStack<Integer> list = new ArrayListStack<>();

//        压栈
        list.push(11);
        list.push(22);
        list.push(33);
        list.push(44);
        System.out.println(list);

//        取
        System.out.println(list.peek());
//        出
        System.out.println(list.pop());
    }
}
