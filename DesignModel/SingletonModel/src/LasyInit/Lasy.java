package LasyInit;

//构造器私有化，只保留一个私有实例，只能通过类方法getInstance()获取
//只有当需要时才创建该实例
public class Lasy {
    private Lasy singleton=null;

    private Lasy(){}


    public Lasy getInstance()
    {
        if(singleton==null)
            singleton=new Lasy();
        return singleton;
    }
}
