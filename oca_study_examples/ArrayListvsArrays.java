package oca_study_examples;

import java.util.ArrayList;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-16
 */
public class ArrayListvsArrays
{
    public static void main(String[] args)
    {
        String[] a = {"a","b","c"};
        String[] b = new String[3];
        b[0] = "a";
        b[1] = "b";
        b[2] = "c";

        ArrayList<String> c = new ArrayList<>(3);
        ArrayList<String> d = new ArrayList<>(3);
        c.add("a"); c.add("b"); c.add("c");
        d.add("a"); d.add("b"); d.add("c");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

    }
}
