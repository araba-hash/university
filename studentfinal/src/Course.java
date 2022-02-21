public class Course extends Student {
    private String cn;
    private String ch;
    private int grade;

    public  Course (){
        Student student=new Student();
        student.getId();
        student.getName();
        student.getMajor();
        student.getBirthdate();
    }
    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }
    public String getCh() {
        return ch;
    }
    public void setCh(String ch) {
        this.ch = ch;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
