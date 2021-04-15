package biaozhunlei;

public class Cs {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 18, "足球");

        // 该方法默认调用toString
        System.out.println(p1); //Person{pname='张三', age=18, aihao='足球'}
    }
}
