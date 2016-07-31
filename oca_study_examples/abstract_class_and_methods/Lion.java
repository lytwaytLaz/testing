package oca_study_examples.abstract_class_and_methods;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-27
 */

//The first concrete class must implement all abstract methods from all classes it extends
//except when another superclass already implemented the method from its superclass.
//Here getNumLegs is already implemented in BigCat so not necessary in this class since it
//inherits that method from BigCat. BigCat can be overridden here though.

public class Lion extends BigCat {
    @Override
    public String getName() {
        return "Lion";
    }
//    @Override
//    public int getNumLegs() {
//        return 4;
//    }
    @Override
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}