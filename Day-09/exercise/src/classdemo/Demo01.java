package classdemo;


public class Demo01 {
    public static void main(String[] args) {
        /*
        *  类的使用：
        *       类名 对象名 = new 类名();
        * */

//        对象的创建
        Person p1 = new Person();

//       成员变量的使用
        p1.name = "范志伟";
        p1.age = 20;
        System.out.println(p1.name);
        System.out.println(p1.getIdCard()); // 外界使用私有成员变量



        Person p2 = new Person();
//        成员方法的使用
        p2.talk();
    }
}
