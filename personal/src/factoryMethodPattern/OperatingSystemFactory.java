package factoryMethodPattern;

//this factory class create the product and return it to shop class
public class OperatingSystemFactory {

    public OS createOS(String type) {
        OS os;
        if (type.equals("Android"))
            os = new Android();
        else if (type.equals("IOS"))
            os = new IOS();
        else
            os = new Windows();
        return os;
    }
}
