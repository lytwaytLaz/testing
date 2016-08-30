import java.util.*;
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
//        char[] cX = {'a','b','c'};
//        String sS= new String(cX);
//        String sX = "abc";
//        System.out.println(new Date());
//
//
//        List<String> str = Arrays.asList(new String(cX), "23", "z");
//        sort(str);
//        System.out.println(str);
//
//        System.out.println(sS);
//        System.out.println(sX);
//        System.out.println(sS == sX);
//
//        System.out.println(binarySearch(str, "b"));

//        int[] scores = {1,2,3,4,5,6};
//        System.arraycopy(scores, 2, scores, 3, 2);
//        for(int i:scores)
//            System.out.println(i);

        int i = 1;
        int j = i++;
        if((i == ++j) | (i++ == j))
        {
            i+=j;
        }
        System.out.println(i);

        ArrayList<Double> al = new ArrayList<>();
//        al.add(111);
        System.out.println(al.indexOf(1.0));
        System.out.println(al.contains("string"));




    }

}
