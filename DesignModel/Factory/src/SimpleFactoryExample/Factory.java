package SimpleFactoryExample;

public class Factory {

    public production createProduction(String productionType)
    {
        switch (productionType)
        {
            case "productionA":return new productionA();
            case "productionB":return new productionB();
            default:return  null;
        }
    }

}
