public class Cs {
    public static void main(String[] args) {
//        泛型的应用
        Array<Student> studentList = new Array<>(5);

//        添加测试
        studentList.addFirst(new Student("zs",123));
        studentList.addLast(new Student("ls",456));
        System.out.println(studentList.toString());
    }
}
