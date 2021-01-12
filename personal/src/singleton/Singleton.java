package singleton;
/*
Creational design patterns are design patterns
that deal with object creation mechanisms,
trying to create objects in a manner suitable to the situation
 */
/*
it is a creational pattern
if we need only one instance of a class we use singleton class
ex: preferences
 */


public class Singleton {
    private static Singleton singleton = null;

    //as constructor is private, we cannot instantiate any object of it
    private Singleton(){
        /*
        codes
         */
    }

    //this approach of singleton is called lazy creation : we dont create the instance if it is not called
    public static Singleton getInstance(){
        if(singleton==null)
            singleton = new Singleton();
        return singleton;
    }

    //i think it can be used for CurrentUser class

}
