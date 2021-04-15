package gouzaofn.lianxiti;

public class Cs01 {
    public static void main(String[] args) {
        Student s1 = new Student("小明","男",40,"老刘");
        Student s2 = new Student("小张","男",30,"老刘");
        Student s3 = new Student("小红","女",35,"老庞");
        System.out.println(s1.getTname());
        System.out.println(s2.getSex());
        System.out.println(s3.getScore());
    }
}
