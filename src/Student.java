public class Student {
    String name;
    int age;
    int score;
    public Student(String n,int a,int b){
        name = n;
        age = a;
        score = b;
    }
    public static String getGrade(int score){
        if(score >=90) {
            return "A";
        } else if (score >=80) {
            return "B";
        } else if (score >=70) {
            return "C";
        } else if (score >=60) {
            return "D";
        }else {
            return "E";
        }
    }
    public void introduce(){
        System.out.println("我叫" + name + ", 今年" + age + "岁");
        System.out.println(score + " -> " + getGrade(score));
    }
    public static void main(String[] args){
        Student s1 = new Student("小明", 20, 85);
        Student s2 = new Student("小红", 19, 92);
        Student s3 = new Student("小刚", 21, 58);
        Student[] students={s1,s2,s3};
        for(Student s : students){
            s.introduce();
        }
    }
}
