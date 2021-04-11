package gouzaofn.ts1;

/*
*  构造方法 : 为了更好的为成员变量赋值，更好的创建对象。
*
*       定义在成员变量和成员方法同级下：public Phone(){} 无返回值和返回类型
*
* */

public class Phone {
    private String pname;

//    构造方法：方法名必须和类名一致
    public Phone(){
        System.out.println("我是构造方法");
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
