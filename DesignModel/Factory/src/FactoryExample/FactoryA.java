package FactoryExample;

public class FactoryA  implements  Factory{
    @Override
    public production create() {
        return new productionA();
    }
}
