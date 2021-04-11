package thisgjz;

/*
 *  this ：指向 new 关键字实例出的对象  ， 谁调用指向谁。
 *
 * */


public class Phone {
    private String pname;

    public void run1(){
        String pname = "aa";
        System.out.println(pname);
//        System.out.println(this.pname);
        /*
        *  当成员变量和局部变量相同时，直接使用变量名会遵循就近原则。
        *  static (静态)成员变量的使用 需要 类名.成员变量名
        *  成员变量的化 this.成员变量名
        * */
    }
    public void run2(){
//      本类中 使用成员变量成员方法都需要 this
        this.run1();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
