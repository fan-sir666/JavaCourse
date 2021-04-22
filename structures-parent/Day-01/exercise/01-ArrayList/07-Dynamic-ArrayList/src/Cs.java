public class Cs {
    public static void main(String[] args) {
//        泛型的应用
        Array<Student> studentList = new Array<>(5);

//        添加测试
        studentList.addFirst(new Student("zs",123));
        studentList.addLast(new Student("ls",456));
        studentList.addFirst(new Student("ww",123));
        studentList.addLast(new Student("zl",456));
        studentList.addFirst(new Student("hh",123));
        System.out.println(studentList.toString());
        studentList.addLast(new Student("kr",456));
        System.out.println(studentList.toString());
    }
}
