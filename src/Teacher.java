public class Teacher extends Person {
    private String subject;
    public Teacher(String subject,String name,int age){
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我教" + subject);
    }
}
