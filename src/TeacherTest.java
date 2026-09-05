public class TeacherTest {
    public static void main(String[] args){
        Teacher t = new Teacher("Java", "王老师",40);
        t.setSubject("math");
        t.introduce();
        System.out.println(t.getSubject());
    }
}
