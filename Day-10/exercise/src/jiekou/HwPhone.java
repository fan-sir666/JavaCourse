package jiekou;

/*
 *     实现接口 ：通过接口 定义普通java类
 *
 *          格式: public class 类名 implements 接口名{}
 *
 *          一个类支持实现多个接口 implements 关键字后面 用，号隔开
 * */
public class HwPhone implements Phone {

//    重写方法
    @Override
    public  void  call(){
        System.out.println("我是华为手机可以打电话");
    }
}
