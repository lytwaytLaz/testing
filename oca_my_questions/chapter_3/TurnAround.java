package oca_my_questions.chapter_3;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ofLocalizedDate;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-19
 */
public class TurnAround
{
    public static void main(String[] args)
    {
//        int[] x = {1,2,3};
//        System.out.println(Arrays.toString(x));
//
////      Stringbuilder equality
//        StringBuilder sb = new StringBuilder("chikaman");
//        StringBuilder bs = new StringBuilder(("chikaman"));
//        System.out.println(sb.equals(bs));
//        System.out.println(sb == bs);
//
////      Ternary function same type for both true and false
//        System.out.println(x.length == 3 ? intValue(42.0): 42.0);
            String s1 = "java";
            StringBuilder s2 = new StringBuilder("java");
//            if (s1 == s2)
//                System.out.print("1");
            if (s1.equals(s2))
                System.out.print("2");
//
////      Arrayfun
//        List<String> list = new ArrayList<>(12);
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        System.out.println(list.size());
//        System.out.println(list);
//        String[] stringArray = list.toArray(new String[0]);
//        System.out.println(stringArray);
//        System.out.println(stringArray.length);

//      Date&time
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now().toEpochDay());

        LocalDateTime dateTime = LocalDateTime.of(2011, Month.AUGUST, 13, 1, 12);
        System.out.println(dateTime.getDayOfWeek());
        LocalDate date = dateTime.toLocalDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(date.format(formatter));
        System.out.println(date.format(ISO_LOCAL_DATE));
        System.out.println(date.format(ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date.format(ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date.format(ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(ofLocalizedDate(FormatStyle.SHORT)));






    }
}
