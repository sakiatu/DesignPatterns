package factoryMethodPattern;

public class BudgetOperationSystemStore extends OperatingSystemStore{
    private OperatingSystemFactory factory;
    public BudgetOperationSystemStore(OperatingSystemFactory factory) {
        super(factory);
        this.factory = factory;
    }

    @Override
    OS createOS(String type) {
        return factory.createOS(type);
    }
}
