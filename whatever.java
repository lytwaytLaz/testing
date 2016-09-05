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
//
//        String ssNum = "206705043293";
//
//        // birth date in past?
//        String date = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
//        System.out.println(date);
//        if (ssNum.substring(0, 8).compareTo(date) > 0)
//            System.out.println("false 1");
//
//        // social security number valid? Luhn-algorithm
//        int num = Integer.parseInt(ssNum.substring(2, 11));
//        int control;
//        int checksum = 0;
//        for (int i = 0; i < 9; i++)
//        {
//            control = num % 10;
//            num = num / 10;
//            if (i % 2 == 0)
//            {
//                control *= 2;
//                if (control > 9)
//                control = control % 10 + 1;
//            }
//            checksum += control;
//        }
//        if (10 - checksum % 10 != Integer.parseInt(ssNum.substring(11)))
//            System.out.println("false 2");
//
        // hash values of two strings are always identical if String_1.equals(String_2) evaluates to true
        String test_1 = "Superfly";
        String test_2 = new String("Superfly");
        System.out.println(test_1.equals(test_2));
        System.out.println(test_1.hashCode() == test_2.hashCode());
    }

}
