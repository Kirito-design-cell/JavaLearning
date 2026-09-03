public class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name,int age,int score){
        this.name = name;
        setAge(age);
        setScore(score);
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;}
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0 || age > 150){
            System.out.println("年龄不合法.拒绝修改: " + age);
            return;
        }
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score < 0 || score >100){
            System.out.println("分数不合格,拒绝修改: " + score);
            return;
        }
        this.score = score;
    }
    public void introduce() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }

}
