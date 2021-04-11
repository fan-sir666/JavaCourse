package gouzaofn.ts3;

public class C {
    /*
    *  有成员变量无参的构造方法创建
    *  Alt+ins 选择 Constructor --> 直接Select None
    *
    *  有参的化 选择相关参数点击ok
    * */
    private String name;
    private int age;

//    为了快捷创建对象
    public C() {
    }

//    满参： 为了成员变量赋值
    public C(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
