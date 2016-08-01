import static java.lang.Character.isLetter;
import static java.lang.Character.*;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-05
 */
public class Cast {
    public static void main(String[] args) throws ClassCastException{
//         will cause a ClassCastException
//        Object obj = new Integer(3);
//        String str = (String) obj;
//        System.out.println(str);
//
//        int a = 10;
//        char c = 'c';
//        byte b = (byte) 129;
//        System.out.println(b);
//        System.out.println(a+b+c);
//
        long t = -19239999789L;
        int n = (int)t;
        System.out.println(n);
//
//        int y = 1;
//        boolean x;
//        System.out.println(y < 100 || (y < 10));

    }
}
