package se.lexicon.laszlo.generics_testing;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isLetter;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-10
 */
public class JavaLangChar {
    public static void main(String[] args) {
        String in = new String("hej då.");
        StringBuilder toMap = new StringBuilder();

        for (int i = 0; i < in.length(); i++)
        {
            if (isLetter(in.charAt(i)))
            {
                toMap.append(in.charAt(i));
            }
            else if (toMap != null || !toMap.equals(""))
            {
                System.out.println(toMap);
                toMap.delete(0, toMap.length() + 1);
            }

        }

        Map<String, String> map = new HashMap<>();
//        if (map.isEmpty())
//            map.put("a", "1");
        System.out.println(map.toString());
    }
}
