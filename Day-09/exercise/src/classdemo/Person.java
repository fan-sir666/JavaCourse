package classdemo;


/*
 *  类 : 一个java文件就是 一个类 就是一个引用数据类型(可称为 一个 class)
 *
 *   成员变量  和  成员方法
 * */

//        基本创建
public class Person {
    String name;
    int age ;
//    私有成员变量
    private  String idCard = "1302584654215";

    public void talk(){
        System.out.println("交谈");
    }
    public void eat(){
        System.out.println("吃饭");
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
