package FactoryExample;

public class FactoryB implements Factory{
    @Override
    public production create() {
        return new productionB();
    }
}
