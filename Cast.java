/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-05
 */
public class Cast {
    public static void main(String[] args) {
        // will cause a ClassCastException
        Object obj = new Integer(3);
        String str = (String) obj;
        System.out.println(str);
    }
}
