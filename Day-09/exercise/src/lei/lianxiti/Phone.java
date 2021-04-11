package lei.lianxiti;


/*把现实世界中的手机(Phone)，变成Java类
        已知：
        手机有 颜色color，价格money，品牌pname，级别level	需要保存的数据

        手机有 通话功能（call），发短信功能(msg)，付款功能(pay)

        请将现实世界中的手机，变为Java类

        要求：在main方法中，创建一个手机对象，保存手机信息：
        华为，3000，A，粉色
        调用付款方法*/


public class Phone {
    String pname;
    int money;
    String color;
    private char level;

    public void call(){
        System.out.println("我拥有通话功能");
    }
    public void msg(){
        System.out.println("我拥有发短信功能");
    }
    public void pay(){
        System.out.println("我拥有付款功能");
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }
}
