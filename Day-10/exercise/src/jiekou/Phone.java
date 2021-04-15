package jiekou;


/*
*  接口:  定义通过 interface 关键字，用来定义规范、增强程序扩展性
*
*    注意:   ①接口 不能有构造函数 更不能直接new对象
*            ② 不可以 对变量再次赋值 java默认加了  public static final 实则都是常量
* */


//  手机接口

public interface Phone {
//    常量
    String NAME = "小张";
//    规范 该方法 需要 普通类中重写 通过实例对象调用
    void call(); // 无需方法体

//   静态方法
    static void run(){
        System.out.println("奔跑");
    }

//    默认方法 不能类名.方法名调用 必须实例对象调用
    default void moren(){
        System.out.println("默认方法");
    }
}
