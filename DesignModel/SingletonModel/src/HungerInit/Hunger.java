package HungerInit;

//构造器私有化，只保留一个私有实例，只能通过类方法getInstance()获取
public class Hunger {
    private Hunger singleton=new Hunger();
    private Hunger()
    {
    }

    public Hunger getInstance()
    {
        return singleton;
    }
}
