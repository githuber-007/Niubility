public class ConcreteDecorator01 extends DecoratorComponent{
    public ConcreteDecorator01(Component ConcreteComponent)
    {
        super(ConcreteComponent);
    }

    @Override
    public void operate() {

        //增强操作

        super.operate();
    }
    //增强的功能函数
    public void enhance()
    {
        System.out.println("为ConcreteComponent添加功能");
    }

}
