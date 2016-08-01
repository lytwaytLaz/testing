package method_referencing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-03
 */
public class MethRef
{
    public static void main(String[] args)
    {
        Integer a = new Integer(12);
        Integer b = new Integer(4);

        List<Integer> intList = new ArrayList<>();

        intList.add(a);
        intList.add(b);

        intList.forEach(System.out::println);
        intList.forEach(System.out::println);
    }
}
