/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-10
 */
public class laszlo2 {
    static short x = 2;
    static short y = 10;
    public static void main(String[] args)
    {
//        short z = x * y;
//        short z = (int) (x * y);
//        short z = (short) (x * y);
//        int z = (short) (x * y);
//        y = y * x; short z = y;
        y *= x; short z = y;

        if (z == 20)
            System.out.println(z);
    }

}
