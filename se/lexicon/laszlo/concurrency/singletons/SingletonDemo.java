package se.lexicon.laszlo.concurrency.singletons;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-14
 */

//implemantation

class Singleton {

    private static Singleton singleton = new Singleton( );

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton(){ }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        return singleton;
    }
    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.demoMethod( );
    }
}