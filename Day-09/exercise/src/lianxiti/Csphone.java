package lianxiti;

public class Csphone {
    public static void main(String[] args) {
//        创建
        Phone p1 = new Phone();

        p1.pname = "华为";
        p1.money = 3000;
        p1.color = "pink";
        p1.setLevel('A');

        p1.pay();
    }
}
