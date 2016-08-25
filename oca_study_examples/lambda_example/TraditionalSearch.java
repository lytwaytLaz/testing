package oca_study_examples.lambda_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-22
 */
public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper()); // pass class that does check, on class for each check is needed
        //below is the lambda version of line 19
//        print(animals, a -> a.canHop());
//        print(animals, a -> a.canSwim());
//        print(animals, a -> !a.canSwim());
        }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
            }
        System.out.println();
        }
    }