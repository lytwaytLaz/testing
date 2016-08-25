import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static java.util.Collections.binarySearch;
import static java.util.Collections.sort;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-15
 */
public class whatever
{
    public static void main(String[] args)
    {
        char[] cX = {'a','b','c'};
        String sS= new String(cX);
        String sX = "abc";
        System.out.println(new Date());


        List<String> str = Arrays.asList(new String(cX), "23", "z");
        sort(str);
        System.out.println(str);

        System.out.println(sS);
        System.out.println(sX);
        System.out.println(sS == sX);

        System.out.println(binarySearch(str, "b"));


    }

}
