public class AnimalTest {
    public static void main(String[] args){
        Animal[] animals = {
                new Dog("旺财"),
                new Cat("咪咪")
        };
        animals[0].setName("大黄");
        for(Animal a :animals){
            System.out.println(a.getName() + "开始介绍");
            a.showInfo();
            a.sound();
        }
    }
}
