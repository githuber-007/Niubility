/**
 *
 * 装饰类的基类
 *
 */

public class DecoratorComponent implements Component{
    private Component concreteComponent;
    public DecoratorComponent(Component concreteComponent)
    {
        this.concreteComponent=concreteComponent;
    }
    @Override
    public void operate() {
        concreteComponent.operate();
    }

}
