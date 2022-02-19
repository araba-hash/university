public class Course {
    private String cn ;
    private int ch;
    private int grade ;
    public Course(){}
    public Course(String cn ,int ch,int grade){
        this.ch=ch;
        this.cn=cn;
        this.grade=grade;
    }
    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
