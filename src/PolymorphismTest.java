public class PolymorphismTest {
    public static void main(String[] args){
        Person[] people = {
                new Student("小明", 20, 85),
                new Teacher("Java", "王老师", 40)
        };

        for(Person p : people){
            if(p instanceof Student s){
                System.out.println("成绩: " + s.getScore());
            } else if (p instanceof Teacher t) {
                System.out.println(t.getSubject());

            }
            p.introduce();
        }
    }
}
