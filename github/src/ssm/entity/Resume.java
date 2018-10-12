package ssm.entity;

public class Resume {
    private String name;
    private String sex;
    private Integer age;
    private String education;
    private String contact;
    private String email;
    private String job;
    private String face;
    private String work;
    private String experience;
    private String salary;
    private String hobby;

    public Resume() {
    }

    public Resume(String name, String sex, Integer age,
                  String education, String contact, String email,
                  String job, String face, String work,
                  String experience, String salary, String hobby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.contact = contact;
        this.email = email;
        this.job = job;
        this.face = face;
        this.work = work;
        this.experience = experience;
        this.salary = salary;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", face='" + face + '\'' +
                ", work='" + work + '\'' +
                ", experience='" + experience + '\'' +
                ", salary='" + salary + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
