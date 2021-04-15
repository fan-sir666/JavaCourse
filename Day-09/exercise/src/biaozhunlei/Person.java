package biaozhunlei;

public class Person {
    private String pname;
    private int age;
    private String aihao;

    public Person() {
    }

    public Person(String pname, int age, String aihao) {
        this.pname = pname;
        this.age = age;
        this.aihao = aihao;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", age=" + age +
                ", aihao='" + aihao + '\'' +
                '}';
    }
}
