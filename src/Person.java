public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        setAge(age);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age < 0 || age > 150){
            System.out.println("年龄不合法, 拒绝修改: " + age);
            return;
        }
        this.age = age;
    }
    public void introduce(){
        System.out.println("我叫" + name + ", 今年" +age + "岁");
    }
}
