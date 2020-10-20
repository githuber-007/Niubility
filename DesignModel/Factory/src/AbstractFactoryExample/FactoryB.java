package AbstractFactoryExample;

public class FactoryB implements  Factory{
    @Override
    public production1 createProduction1() {
        return new production1B();
    }

    @Override
    public production2 createProduction2() {
        return new production2B();
    }
}
