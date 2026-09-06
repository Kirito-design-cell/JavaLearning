public class Duck extends Animal implements Flyable , Swimmable {
    public Duck(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("嘎嘎！");
    }

    @Override
    public void fly(){
        System.out.println("飞起来了");
    }

    @Override
    public void swim(){
        System.out.println("游起来了");
    }

}
