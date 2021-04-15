package lianxiti;

public class Cs {
    public static void main(String[] args) {
        Square s = new Square();
        Circle c = new Circle();
        double x1 = s.area(2);
        double x2 = c.area(3);
        System.out.println("边长为2的正方形面积:" + x1);
        System.out.println("半径为2的园圆面积:" + x2);
    }
}
