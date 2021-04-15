package lianxiti;

/*要求设计一个Computable接口，以及它的两个实现类：Square和Circle
        其中：
        1）Computable接口拥有一个抽象方法area，方法接收有一个double类型的参数，返回一个double类型的结果
        2）Square类和Circle类 分别实现了Computable接口的area()抽象方法，分别求正方形和圆形的面积并返回

        要求在测试类Demo1.java中分别创建Square类和Circle类的对象，
        计算边长为2的正方形面积 和 半径为3的圆形面积*/

public interface Computable {
    double area(double x);
}
