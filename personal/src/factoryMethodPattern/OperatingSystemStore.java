package factoryMethodPattern;

public abstract class OperatingSystemStore {
    private OperatingSystemFactory factory;

    public OperatingSystemStore(OperatingSystemFactory factory) {
        this.factory = factory;
    }

    public OS orderOS(String type){
        OS os;
        //create os from factory
//        os = factory.createOS(type);
        os = createOS(type);
        //os.method()
        return os;
    }

    abstract OS createOS(String type);
}
