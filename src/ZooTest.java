public class ZooTest {
    public static void main(String[] args){
        Duck duck = new Duck("小黄");
        Animal[] animals = { duck };
        Flyable[] flyers = { duck };
        Swimmable[] swimmers = {duck };

        animals[0].sound();
        flyers[0].fly();
        swimmers[0].swim();
    }
}
