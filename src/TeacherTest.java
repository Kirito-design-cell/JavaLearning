public class TeacherTest {
    public static void main(String[] args){
        Teacher t = new Teacher("Java", "王老师",40);
        t.setSubject("Spring");
        t.introduce();
        System.out.println(t.getSubject());
    }
}
