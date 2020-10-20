/**
 * 具体的装饰者类
 * 有不同的增强操作
 */

public class ConcreteDecorator02 extends DecoratorComponent{
    public ConcreteDecorator02(Component concretecomponent)
    {
        super(concretecomponent);
    }
    @Override
    public void operate() {
        enhance02();
        super.operate();
    }

    //增强操作
    public void enhance02(){System.out.println("为ConcreteComponent添加功能02");}
}
