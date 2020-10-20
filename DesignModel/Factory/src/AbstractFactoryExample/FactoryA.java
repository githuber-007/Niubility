package AbstractFactoryExample;

public class FactoryA implements Factory{
    @Override
    public production1 createProduction1() {
        return new production1A();
    }

    @Override
    public production2 createProduction2() {
        return new production2A();
    }
}
