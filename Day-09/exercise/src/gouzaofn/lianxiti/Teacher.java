package gouzaofn.lianxiti;

public class Teacher {
    private String tname;
    private String lesson_name;

    public Teacher(String tname, String lesson_name) {
        this.tname = tname;
        this.lesson_name = lesson_name;
    }

    public Teacher() {
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
    }
}
