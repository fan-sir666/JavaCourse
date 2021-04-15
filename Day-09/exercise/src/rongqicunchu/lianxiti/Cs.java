package rongqicunchu.lianxiti;

import java.util.ArrayList;
import java.util.Collections;

public class Cs {
    public static void main(String[] args) {
        /*已知一个公司是有5名员工，有2名经理  (自定义填充)
        1、求所有员工的月工资总和？
        2、求所有员工的年终奖 总和是多少？*/

        ArrayList<Employee> elist = new ArrayList<>();
        Collections.addAll(elist,
                new Employee("张一",1000.0,"员工"),
                new Employee("张二",2000.0,"员工"),
                new Employee("张三",3000.0,"员工"),
                new Employee("张四",4000.0,"员工"),
                new Employee("张五",5000.0,"员工"),
                new Employee("李四",10000.0,"经理"),
                new Employee("王五",10000.0,"经理")
                );
//        1. 月工资总和
        double salSum = 0.0;
        for (int i = 0; i < elist.size(); i++) {
            salSum += elist.get(i).getSal();
        }
        System.out.println(salSum);

//        2.年终奖总和
        double awardSum = 0.0;
        for (int i = 0; i < elist.size(); i++) {
            awardSum += elist.get(i).getAward();
        }
        System.out.println(awardSum);
    }
}
