/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-10
 */
public class Beeblebrox {
    static String x;
    public static void main(String[] args) {
        if (x != null && x.equals("banana")) {System.out.println(x);}
        else {System.out.println(x = "banana");}
    }}
