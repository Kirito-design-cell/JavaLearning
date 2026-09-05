public class PolymorphismTest {
    public static void main(String[] args){
        Person[] people = {
                new Student("小明", 20, 85),
                new Teacher("Java", "王老师", 40),
                new Doctor("李医生", 45, "无锡人民医院"),
        };

        for(Person p : people){
            if(p instanceof Student s){
                System.out.println("成绩: " + s.getScore());
            } else if (p instanceof Teacher t) {
                System.out.println(t.getSubject());
            } else if (p instanceof Doctor d) {
                d.setHospital("无锡人民医院");
                System.out.println("医院: " + d.getHospital());
            }
            p.introduce();
        }
    }
}
