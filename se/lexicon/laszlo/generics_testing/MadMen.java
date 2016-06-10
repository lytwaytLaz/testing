package se.lexicon.laszlo.generics_testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-08
 */
public class MadMen {
    public void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlsson = new Person("Peggy Olsson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlsson);
        madMen.add(bertCooper);

//        Collections.sort(madMen); //Why this no work?

        Map<String, Person> madMen2 = new HashMap<>();
        madMen2.put(donDraper.getName(), donDraper);


        System.out.println(madMen);
        System.out.println(madMen2);



    }
}
