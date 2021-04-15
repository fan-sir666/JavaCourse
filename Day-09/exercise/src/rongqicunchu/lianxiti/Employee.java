package rongqicunchu.lianxiti;

/*已知要将现实生活中的员工(Employee)变成一个Java类
        员工的信息   姓名name
        薪水sal
        职位 position
        年终奖 award

        设计员工类时：
        1、薪水不能设置为负数
        2、职位只能设置如下的字符串：
        “员工”，“经理”
        3、年终奖是计算出来的
        只有经理有年终奖
        计算公式 = 薪水*12
        普通员工的年终奖为0
*/

public class Employee {
    private String name; // 姓名
    private double sal;  // 月工资
    private String position; // 职位
    private double award; // 年终奖

    public Employee() {
    }

    public Employee(String name, double sal, String position) {
        this.name = name;
        setSal(sal);
        setPosition(position);
    }

    //    姓名
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    月工资
    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
//        非负数
        if (sal >= 0) {
            this.sal = sal;
        }
    }

//    职位

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.equals("员工") || position.equals("经理")) {
            this.position = position;
        }
    }

    //    年终奖
    public double getAward() {
        if (this.getPosition().equals("经理")) {
            return this.getSal() * 12;
        } else {
            return 0.0;
        }
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", position='" + position + '\'' +
                ", award=" + award +
                '}';
    }
}
