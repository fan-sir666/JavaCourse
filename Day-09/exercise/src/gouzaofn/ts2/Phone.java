package gouzaofn.ts2;

/*
 *  构造方法 : 为了更好的为成员变量赋值，更好的创建对象。
 *
 *
 * */

public class Phone {
    private String pname;

    //    构造方法：带有参数 且 为成员变量赋值 使用this
    public Phone(String pname) {
        this.pname = pname;
        System.out.println("我是构造方法");
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
