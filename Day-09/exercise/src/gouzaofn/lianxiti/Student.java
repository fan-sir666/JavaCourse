package gouzaofn.lianxiti;

public class Student {
    private String sname;
    private String sex;
    private int score;
    private String tname;

    public Student() {
    }

    public Student(String sname, String sex, int score, String tname) {
        this.sname = sname;
        this.sex = sex;
        this.score = score;
        this.tname = tname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
