public class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student("小明", 20, 85);
        // System.out.println(s1.name);
        System.out.println(s1.getName());
        s1.setAge(-5);
        System.out.println(s1.getAge());

        s1.setAge(21);
        System.out.println(s1.getAge());

        s1.setScore(99);
        System.out.println(s1.getScore());
        s1.setName("小华同学");
        System.out.println(s1.getName());

        s1.introduce();

    }
}
