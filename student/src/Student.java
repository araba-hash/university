public class Student {
    private String id;
    private String name;
    private String major;
    private String birthdate;
    public Student(){

    }
    public Student(String id,String name,String major ,String birthdate){
        this.id=id;
        this.name=name;
        this.major=major;
        this.birthdate=birthdate;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }



}

