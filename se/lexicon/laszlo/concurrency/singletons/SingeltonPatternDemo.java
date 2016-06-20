package se.lexicon.laszlo.concurrency.singletons;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-14
 */

class SingleObject
{   //Create a single object
    private static SingleObject instance = new SingleObject();

    //make constructor private so this class can't be instantiated
    private SingleObject() {}

    //Get the only object available
    public static SingleObject getInstance()
    {
        return instance;
    }

    public void showMessage()
    {
        System.out.println("Yo!");
    }


}


public class SingeltonPatternDemo
{
    public static void main(String[] args) {

        //below not allowed, constructor not visible, private
        //Compile Time Error
        //SingleObject object = new SingleObject();

        //get the only available object
        SingleObject object = SingleObject.getInstance();

        //use method
        object.showMessage();

    }
}
