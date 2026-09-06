public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("啾啾！");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " 飞起来了");
    }
}
