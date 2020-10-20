/**
 * 具体的被装饰者
 * 被装饰时，自身的功能不会改变
 * 即operate()函数的功能不变
 */

public class ConcreteComponent implements Component{

    @Override
    public void operate() {
        System.out.println("我是被装饰者");
    }
}
