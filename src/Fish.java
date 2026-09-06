public class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("嘘嘘");
    }
    @Override
    public void swim() {
        System.out.println("游起来了");
    }
}
